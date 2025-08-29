import { Component, OnInit } from ''@angular/core';';
import { Router } from ''@angular/router';';
import { Product, ProductService } from ''../../services/product.service';';
import { CommonModule } from ''@angular/common';';
app-product-list

./product-list.html
<link rel="stylesheet" href="./product-list.css">
imports: [CommonModule]

class ProductListComponent /* implements OnInit */ {
  products /* type: Product[] */ = [];
  constructor(productService, router) {
  }
  function ngOnInit() {
    this.loadProducts(this.loadProducts);;
  }
  function loadProducts() {
    this.products = this.productService.getAll();;
  }
  function deleteProduct(id) {
    this.productService.deleteById(this.productService.deleteById, id);;
    this.loadProducts(this.loadProducts);;
  }
  function goToDetails(id) {
    this.router.navigate(details, id);;
    ;
  }
  function goToAdd() {
    this.router.navigate(add);;
    ;
  }
}

