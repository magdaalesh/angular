



// component: app-product-list

./product-list.html
// styleUrls: [./product-list.css]
// imports: [CommonModule]

class ProductListComponent /* implements OnInit */ {
  products /* type: Product[] */ = [];
  constructor(productService, router) {
    this.productService = productService;
    this.router = router;
  }
  ngOnInit() {
    this.loadProducts(this.loadProducts);
  }
  loadProducts() {
    this.products = this.productService.getAll();
  }
  deleteProduct(id) {
    this.productService.deleteById(this.productService.deleteById, id);
    this.loadProducts(this.loadProducts);
  }
  goToDetails(id) {
    window.location.href = "/details.html" + "?id=" + encodeURIComponent(id);
  }
  goToAdd() {
    window.location.href = "/add.html";
  }
}

