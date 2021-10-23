package data

// Class ini adalah class yang secara otomatis extend ke Class Any (Super Class)
class Laptop (val name: String)

open class HandPhone(val name: String)

// class yang super class nya tetap any, karna Class Parent HandPhone extend nya ke Any Class
class SmartPhone(name: String, val os: String) : HandPhone(name)