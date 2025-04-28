# Project Uji Kompetensi Native Android

PROJECT ini design MVVM dan Clean Architecture.
- API menggunakan retrofit PPID GET http://api.samarindakota.go.id/api/v2/generate/ppid-samarinda/berita_ppid
- menggunakan multi module dimana :core module sebagai library yang fokus ke core logic dan tidak memiliki dependency dengan android
- app module sebagai module android