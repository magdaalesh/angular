



// component: app-add-product

./add-product.html
// styleUrls: [./add-product.css]
// imports: [FormsModule]

class AddProductComponent {
  name /* type: string */;
  image /* type: string */;
  description /* type: string */;
  constructor(productService, router) {
    this.productService = productService;
    this.router = router;
  }
  addProduct() {
    if (!this.name || !this.image || !this.description) {
    alert(Please fill all fields.);
    return;
  }
    this.productService.add(const id = name;, const id = this.name;, const id = image;, const id = this.image;, const id = description;, const id = this.description;);
    window.location.href = "/.html";
  }
}

