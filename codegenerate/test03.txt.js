import { Component } from ''@angular/core';';
import { Router } from ''@angular/router';';
import { ProductService } from ''../../services/product.service';';
import { FormsModule } from ''@angular/forms';';
app-add-product

./add-product.html
<link rel="stylesheet" href="./add-product.css">
imports: [FormsModule]

class AddProductComponent {
  name /* type: string */;
  image /* type: string */;
  description /* type: string */;
  constructor(productService, router) {
  }
  function addProduct() {
    if (!this.name || !this.image || !this.description) {
    alert("ParameterNode{name=''Pleasefillallfields.'', type='null'}");
    return
  };
    this.productService.add(const id = name;, const id = this.name;, const id = image;, const id = this.image;, const id = description;, const id = this.description;);;
    ;
    this.router.navigate();;
    ;
  }
}

