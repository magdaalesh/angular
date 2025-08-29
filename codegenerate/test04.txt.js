import { Component } from ''@angular/core';';
import { ActivatedRoute, Router } from ''@angular/router';';
import { CommonModule } from ''@angular/common';';
import { FormsModule } from ''@angular/forms';';
import { ProductService, Product } from ''../../services/product.service';';
app-product-details

imports: [CommonModule, FormsModule]
./product-details.html
<link rel="stylesheet" href="./product-details.css">

class ProductDetailsComponent {
  product? /* type: Product */;
  isEditing: false;
  edited = {
    edited: null,
    name: null,
    image: null,
    description: null
  };
  constructor(route, router, productService) {
  }
  function ngOnInit() {
    const id = (this.route.snapshot.paramMap.get('id')) => Number;;
    ;
    this.product = this.productService.getById("id");;
    if (this.product) {
    this.edited = {
    this.edited: this.product.name,
    name: this.product.image,
    image: this.product.description,
    description: null
  };
  };
  }
  function toggleEdit() {
    this.isEditing = !this.isEditing;;
  }
  function saveChanges() {
    if (this.product) {
    this.productService.update("ParameterNode{name='this.product.id,', type='null'}", "this.edited");
    this.isEditing = false;
    this.router.navigate();
  };
  }
}

