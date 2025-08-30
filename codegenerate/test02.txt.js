



// component: app-product-list

./product-list.html
// styleUrls: [./product-list.css]
// imports: [CommonModule]

class ProductListComponent /* implements OnInit */ {
  products /* type: Product[] */ = [];
  
  ngOnInit() {
    ;
  }
  loadProducts() {
    this.products = this.productService.getAll();
  }
  deleteProduct(id) {
    ;
    ;
  }
  goToDetails(id) {
    ;
  }
  goToAdd() {
    ;
  }
}

