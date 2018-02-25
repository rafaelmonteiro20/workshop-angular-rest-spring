import { Component } from '@angular/core';

@Component({
  selector: 'app-item-cadastro',
  templateUrl: './item-cadastro.component.html',
  styleUrls: ['./item-cadastro.component.css']
})
export class ItemCadastroComponent  {

  itens = [
    { etiqueta : 'AA0001', descricao : 'Notebook Dell i5', dataAquisicao : new Date() },
    { etiqueta : 'AA0034', descricao : 'Monitor Led 20', dataAquisicao : new Date() }
  ]

}
