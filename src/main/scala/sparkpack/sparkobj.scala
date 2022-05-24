package sparkpack
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import sys.process._
import java.util._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Row
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql._
object sparkobj {


	def main(arg:Array[String]):Unit=
		{


				val conf = new SparkConf().setAppName("first").setMaster("local[*]")
						val sc = new SparkContext(conf)
						sc.setLogLevel("ERROR")

						val spark = SparkSession.builder.getOrCreate()
						import spark.implicits._
						println("======Data=======")

						

		}

}