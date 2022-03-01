class Header extends HTMLElement {
    constructor() {
      super();
    }
  
    connectedCallback() {
      this.innerHTML = `
      <script async src="https://www.googletagmanager.com/gtag/js?id=G-62XQ7TYLDW"></script>
      <script>
      window.dataLayer = window.dataLayer || [];
      function gtag(){dataLayer.push(arguments);}
      gtag('js', new Date());
      
      gtag('config', 'G-62XQ7TYLDW');
      </script>
      `;
    }
  }
  
  customElements.define('header-component', Header);


