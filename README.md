## Nomer 1:
Terdapat 2 class parent, yaitu Buildings dan Vehicles yang akan diinheirt setiap class yang berkaitan. <br>
Terdapat interface yaitu Taxable yang berguna untuk menghitung setiap objecct yang dihitung pajaknya.

### Bukti Run
Type: Hotel
Area: 500000
Number of Rooms: 45
 Number of Ballroom: 2
Number of Meeting Room: 3
Taxes: 7505400.000000

Type: Home
Area: 120000
Number of Rooms: 3
Taxes: 1200300.000000

Type: Car
Number Of Roads: 4
Number of Passenger: 6
Weight: 600
HorsePower: 200
Fuel Per Meter: 2.000000
MaxDistance: 22.500000

Type: Bicycle
Number Of Roads: 2
Number of Passenger: 2
Weight: 45

Type: Buildings
Area: 500000
Taxes: 7505400.000000

Type: Buildings
Area: 120000
Taxes: 1200300.000000

Type: Car
HorsePower: 200
Taxes: 20000.000000

## Nomer 2
Indexing adalah cara untuk mengoptimalkan pencarian data dalam database. Indexing biasanya digunakan pada database yang mengangung data yang cukup besar.<br>
Logika dasar dari indexing adalah dengan meminimalisir ukuran file yang digunakan dalam pencarian dan menggunakan pointer untuk menuju ke file yang dimaksud.<br>
Dalam implementasinya, terdapat tabel indexing yang digunakan untuk menyimpan pointer dan kolom yang dilakukan pengindexan. Contoh data yang memerlukan pengindeksan adalah<br>
kolom nama dalam tabel peserta acara lomba dengan peserta lebih dari 100.000. Jika tidak dilakukan indexing akan memakan banyak sekali waktu untuk melakukan pencarian sebuah nama<br>
