import { PatrimonioUiPage } from './app.po';

describe('patrimonio-ui App', function() {
  let page: PatrimonioUiPage;

  beforeEach(() => {
    page = new PatrimonioUiPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
