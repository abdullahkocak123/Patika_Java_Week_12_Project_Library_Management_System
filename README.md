# 📚 Library Management System

Bu proje, basit bir kütüphane yönetim sistemidir. Java, Hibernate (JPA) ve PostgreSQL kullanılarak geliştirilmiştir. Kitap, yazar, yayınevi, kategori ve kitap ödünç alma işlemleri modellenmiştir.

## 🛠️ Kullanılan Teknolojiler

- Java 21  
- Hibernate (JPA)  
- PostgreSQL  
- Maven  
- IntelliJ IDEA

## 🗃️ Veritabanı Modelleri

### 🧑‍💼 Author (Yazarlar)

Yazar bilgilerini tutar. Kitaplarla bire çok (one-to-many) ilişki içindedir.

![image](https://github.com/user-attachments/assets/46f1bbdb-26f9-4bce-92fe-3af1cf8bed0d)
---

### 📖 Book (Kitaplar)

Kitap bilgilerini içerir. Yazar, yayınevi ve kategorilerle ilişkilidir. Ayrıca kitap ödünç alma işlemleriyle bağlantılıdır.

![image](https://github.com/user-attachments/assets/a4171dae-c271-49c3-b081-42bad5053f08)


---

### 🏢 Publisher (Yayınevleri)

Kitapların yayınevlerini temsil eder. Yayınevi ile kitaplar arasında bire çok ilişki vardır.

![image](https://github.com/user-attachments/assets/67ad0b19-9c70-4b19-aca7-bfdbdf4e763b)


---

### 🏷️ Category (Kategoriler)

Kitap kategorilerini tutar. Kitaplarla çoktan çoğa (many-to-many) ilişkilidir.

![image](https://github.com/user-attachments/assets/1e000de5-8ae0-407b-b433-d6f0dcc6d08a)
![image](https://github.com/user-attachments/assets/880c663e-75d3-482b-8991-978de18552e0)



---

### 🔄 BookBorrowing (Ödünç Alma)

Kitapların ödünç alınıp iade edilme süreçlerini yönetir.

![image](https://github.com/user-attachments/assets/9d874b02-7140-4e6e-b871-e34c36570008)



---









