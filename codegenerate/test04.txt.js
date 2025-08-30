




// component: app-product-details

// imports: [CommonModule, FormsModule]
./product-details.html
// styleUrls: [./product-details.css]

class ProductDetailsComponent {
  product /* type: Product */;
  isEditing: false;
  edited = {
    name: null,
    image: null,
    description: null
  };
  constructor(route, router, productService) {
    this.route = route;
    this.router = router;
    this.productService = productService;
  }
  ngOnInit() {
    id = Number(this.route.snapshot.paramMap.get(id));
    this.product = this.productService.getById("id");
    if (this.product) {
    this.edited = {
    name: this.product.name,
    image: this.product.image,
    description: this.product.description
  };
  }
  }
  toggleEdit() {
    this.isEditing = !this.isEditing;
  }
  saveChanges() {
    if (this.product) {
    this.productService.update("this.edited", this.product.id);
    this.isEditing = false;
    window.location.href = "/.html";
  }
  }
}

