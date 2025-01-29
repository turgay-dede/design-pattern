# 📐 Davranışsal Tasarım Desenleri (Behavioral Design Patterns)

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

# 📏 Yapısal Tasarım Desenleri (Structural Design Patterns)

---

### 🧩 Adapter
- **Ne Zaman?** Uyumsuz bir arayüzü mevcut bir sisteme entegre etmeniz gerektiğinde.
- **Nasıl Kullanılır?** Eski sistemle yeni arayüzleri birleştirerek uyumluluk sağlamak için araya bir "adaptör" ekleyin.

---

### 🏗️ Bridge
- **Ne Zaman?** Soyutlama ve uygulamayı birbirinden ayırarak bağımsız olarak geliştirilebilecek bir yapı kurmak istediğinizde.
- **Nasıl Kullanılır?** Soyutlamayı (örneğin, hesap türleri) uygulamadan (örneğin, ödeme yöntemleri) ayırarak her ikisini de esnekçe genişletebilirsiniz.

---

### 🎨 Composite
- **Ne Zaman?** Nesneleri ağaç yapısında hiyerarşik olarak düzenlemek ve alt bileşenlerle ana bileşenleri tek bir nesneymiş gibi işlem yapmak gerektiğinde.
- **Nasıl Kullanılır?** Yaprak nesneleri ve bileşenleri bir araya getirip, tüm ağaç yapısına toplu işlemler uygulamak için kullanın.

---

### 🚪 Facade
- **Ne Zaman?** Karmaşık bir sistemde alt bileşenleri gizleyerek, istemciler için basit bir arayüz sağlamak istediğinizde.
- **Nasıl Kullanılır?** Sistemin ana işlevlerini tek bir sınıf üzerinden basitleştirerek erişimi kolaylaştırın.

---

### 🔌 Proxy
- **Ne Zaman?** Bir nesneye erişimi kontrol etme, bu nesneye erişim öncesinde/sonrasında ek işlemler yapma veya maliyetli işlemleri optimize etme ihtiyacı olduğunda.
- **Nasıl Kullanılır?** Gerçek nesnenin yerine geçecek bir "proxy" sınıfı ekleyerek güvenlik, erişim kontrolü veya önbellekleme gibi işlevleri yönetin.

---

### 🌉 Decorator
- **Ne Zaman?** Nesnelere ek özellikler eklemek, ancak bu nesnelerin temel yapısını değiştirmek istemediğinizde.
- **Nasıl Kullanılır?** Temel bir nesneye dinamik olarak işlevler eklemek için dekoratör sınıflar kullanın.

---

### 🔗 Flyweight
- **Ne Zaman?** Büyük sayıda nesne oluşturmanız gerektiğinde, aynı özellikleri taşıyan nesneleri tekrar kullanarak hafızayı optimize etme ihtiyacı olduğunda.
- **Nasıl Kullanılır?** Paylaşılan durumları tek bir nesnede saklayın, her seferinde yeni nesne oluşturmadan belleği koruyun.



