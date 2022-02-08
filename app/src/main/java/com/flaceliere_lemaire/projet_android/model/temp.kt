//package com.flaceliere_lemaire.projet_android.model
//
//import android.content.Context
//import androidx.room.*
//
//@Entity()
//data class Car(
//    @PrimaryKey val id: String,
//    @ColumnInfo(name = "brand") val brand: String,
//    val name: String
//)
//
//@Dao
//interface CarDao {
//
//    @Query("SELECT * FROM Car")
//    fun getAllCars(): Flow<List<Car>>
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertCar(car: Car)
//
//    @Update(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun updateCar(car: Car)
//
//    @Delete
//    suspend fun removeCar(car: Car)
//
//}
//
//@Database(entities = [Car::class], version = 1)
//abstract class AppDatabase : RoomDatabase() {
//    abstract fun dao(): CarDao
//}
//
//class DatabaseManager(context: Context) {
//
//    private val db = Room.databaseBuilder(
//        context,
//        AppDatabase::class.java,
//        "db.sqlite"
//    ).build()
//
//    suspend fun insertCar(car: Car) {
//        db.dao().insertCar(car)
//    }
//
//    fun getCars() : Flow<List<Car>> {
//        return db.dao().getAllCars()
//    }
//
//}