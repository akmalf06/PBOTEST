## Nomer 1:
Terdapat 2 class parent, yaitu Buildings dan Vehicles yang akan diinheirt setiap class yang berkaitan. <br>
Terdapat interface yaitu Taxable yang berguna untuk menghitung setiap objecct yang dihitung pajaknya.

### Bukti Run
Type: Hotel<br>
Area: 500000<br>
Number of Rooms: 45<br>
Number of Ballroom: 2<br>
Number of Meeting Room: 3<br>
Taxes: 7505400.000000<br>

Type: Home<br>
Area: 120000<br>
Number of Rooms: 3<br>
Taxes: 1200300.000000<br>

Type: Car<br>
Number Of Roads: 4<br>
Number of Passenger: 6<br>
Weight: 600<br>
HorsePower: 200<br>
Fuel Per Meter: 2.000000<br>
MaxDistance: 22.500000<br>

Type: Bicycle<br>
Number Of Roads: 2<br>
Number of Passenger: 2<br>
Weight: 45<br>

Type: Buildings<br>
Area: 500000<br>
Taxes: 7505400.000000<br>

Type: Buildings<br>
Area: 120000<br>
Taxes: 1200300.000000<br>

Type: Car<br>
HorsePower: 200<br>
Taxes: 20000.000000<br>

## Nomer 2
Indexing adalah cara untuk mengoptimalkan pencarian data dalam database. Indexing biasanya digunakan pada database yang mengangung data yang cukup besar.
Logika dasar dari indexing adalah dengan meminimalisir ukuran file yang digunakan dalam pencarian dan menggunakan pointer untuk menuju ke file yang dimaksud.
Dalam implementasinya, terdapat tabel indexing yang digunakan untuk menyimpan pointer dan kolom yang dilakukan pengindexan. Contoh data yang memerlukan pengindeksan adalah
kolom nama dalam tabel peserta acara lomba dengan peserta lebih dari 100.000. Jika tidak dilakukan indexing akan memakan banyak sekali waktu untuk melakukan pencarian sebuah nama
