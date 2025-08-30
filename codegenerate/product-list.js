

provide root => providedIn;
class ProductService {
  products /* type: Product[] */ = [
    { id: "1", name: "Headphone", image: "/product1.jpg", description: "Nice headphones" },
    { id: "2", name: "Sunglasses", image: "/product2.jpg", description: "Stylish sunglasses" },
    { id: "3", name: "Smartphone", image: "/product3.jpg", description: "Latest smartphone" }
  ];
  nextId = 4;
  getAll() {
    return [...this.products];
  }
  getById(id) {
    return this.products.find(p => p.id === id);
  }
  add(product) {
    const newProduct = { id:this.nextId++, ...product }
    ;
  }
  deleteById(id) {
    this.products = this.products.filter(p => p.id !== id);
  }
  update(id, updated) {
    const index = this.products.findIndex(p => p.id === id);
    if (index  > -1) {
    this.products = {id, ...updated}
  }
  }
}

