# 📐 Davranışsal Tasarım Desenleri

---

### 🎛️ Strategy
- **Ne Zaman?** Farklı algoritmalar veya iş mantıkları arasında dinamik olarak geçiş yapma ihtiyacınız varsa.
- **Nasıl Kullanılır?** Her bir algoritmayı veya mantığı kendi sınıfında tanımlayın ve seçim yapılabilir hale getirin.

---

### 📜 Command
- **Ne Zaman?** İşlemleri komut nesneleri olarak temsil etme ihtiyacınız varsa; özellikle geri alma (undo) veya işlem sıralaması gerektiğinde.
- **Nasıl Kullanılır?** Her işlemi bir komut sınıfı olarak tanımlayın, işlemleri yığılarda toplayarak geri alınabilir yapın.

---

### 🔄 Iterator
- **Ne Zaman?** Karmaşık nesne koleksiyonları arasında gezinmek için özel bir erişim yöntemine ihtiyaç duyduğunuzda.
- **Nasıl Kullanılır?** Koleksiyon elemanlarını açığa çıkarmadan bir iteratör sınıfı ile nesneler arasında gezinme işlevi sağlayın.

---

### 📝 Template Method
- **Ne Zaman?** İşlem adımları sabitken, her bir adımın farklı uygulanabilir olduğu durumlarda.
- **Nasıl Kullanılır?** İşlem iskeletini koruyarak, alt adımları özelleştirmek için kullanın.

---

### 👀 Observer
- **Ne Zaman?** Bir nesnedeki değişikliklerin otomatik olarak birden çok bağımlı nesneye bildirilmesi gerektiğinde.
- **Nasıl Kullanılır?** Nesne değişimlerinde birçok bağımlının güncellenmesi için kullanın.

---

### 🗂️ Memento
- **Ne Zaman?** Nesne durumunu dışarı açmadan saklamak ve gerektiğinde geri yüklemek gerektiğinde, özellikle geri alma işlevlerinde.
- **Nasıl Kullanılır?** Nesne durumunu saklamak için memento sınıfını kullanın; geri alma ve kurtarma işlevleri sağlayın.

---

### 🕹️ Mediator
- **Ne Zaman?** Nesneler arasındaki karmaşık ilişkileri yönetmek ve bağımlılıkları azaltmak için merkezi bir iletişim noktası gerektiğinde.
- **Nasıl Kullanılır?** Nesneler arası doğrudan iletişim yerine, bir arabulucu üzerinden etkileşim sağlatın.

---

### 🔗 Chain of Responsibility
- **Ne Zaman?** Bir isteğin birden fazla işleyici tarafından ele alınabilmesi gerektiğinde, özellikle ilk uygun işleyicinin devreye girmesi gerekiyorsa.
- **Nasıl Kullanılır?** İşleyicileri zincir halinde tanımlayın; örneğin, yetkilendirme veya hata işleme için kullanın.

---

### 🧳 Visitor
- **Ne Zaman?** Nesne yapısındaki elemanlar üzerinde yeni işlemler tanımlama ihtiyacınız varsa, nesne yapısını değiştirmeden.
- **Nasıl Kullanılır?** Yeni iş mantıkları eklemek için kullanın; nesne yapısında değişiklik yapmadan genişletilebilir hale getirir.

---

### 🔄 State
- **Ne Zaman?** Nesnenin davranışlarının durumuna göre değişmesi ve durumlar arasında geçiş yapması gerekiyorsa.
- **Nasıl Kullanılır?** Her durumu bağımsız bir sınıf olarak tanımlayın, nesne durum değişiminde farklı davranışlar sergilesin.

---



