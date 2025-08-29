



// component: app-add-product

./add-product.html
// styleUrls: [./add-product.css]
// imports: [FormsModule]

class AddProductComponent {
  name /* type: string */;
  image /* type: string */;
  description /* type: string */;
  
  addProduct() {
    if (!this.name || !this.image || !this.description) {
    alert("ParameterNode{name=''Pleasefillallfields.'', type='null'}");
    return
  }
    ;
    ;
  }
}

