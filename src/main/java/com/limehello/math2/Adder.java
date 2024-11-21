package com.limehello.math2;

import java.util.ArrayList;
import java.util.List;

public class Adder {
 private Adder() {}
 public static int add(int a, int b){
  return a+b;
 }
 public static int addInt(int a, int b){
  return a+b;
 }
 public static double add(double a, double b) {
  return a+b;
 }
 public static double addDouble(double a, double b) {
  return a+b;
 }
 public static float add(float a, float b) {
  return a+b;
 }
 public static float addFloat(float a, float b) {
  return a+b;
 }
 public static short add(short a, short b) {
  return (short)(a+b);
 }
 public static short addShort(short a, short b) {
  return (short)(a+b);
 }
 public static long add(long a, long b) {
  return a+b;
 }
 public static long addLong(long a, long b) {
  return a+b;
 }
 public static byte add(byte a, byte b) {
  return (byte)(a+b);
 }
 public static byte addByte(byte a, byte b) {
  return (byte)(a+b);
 }
 public static int add(int... n){
  int result = 0;
  for (int a : n) {
   result += a;
  }
  return result;
 }
 public static int addInt(int... n){
  int result = 0;
  for (int a : n) {
   result += a;
  }
  return result;
 }
 public static double add(double... n){
  double result = 0;
  for (double a : n) {
   result += a;
  }
  return result;
 }
 public static double addDouble(double... n){
  double result = 0;
  for (double a : n) {
   result += a;
  }
  return result;
 }
 public static float add(float... n){
  float result = 0;
  for (float a : n) {
   result += a;
  }
  return result;
 }
 public static float addFloat(float... n){
  float result = 0;
  for (float a : n) {
   result += a;
  }
  return result;
 }
 public static short add(short... n){
  short result = 0;
  for (short a : n) {
   result += a;
  }
  return result;
 }
 public static short addShort(short... n){
  short result = 0;
  for (short a : n) {
   result += a;
  }
  return result;
 }
 public static long add(long... n){
  long result = 0;
  for (long a : n) {
   result += a;
  }
  return result;
 }
 public static long addLong(long... n){
  long result = 0;
  for (long a : n) {
   result += a;
  }
  return result;
 }
 public static byte add(byte... n){
  byte result = 0;
  for (byte a : n) {
   result += a;
  }
  return result;
 }
 public static byte addByte(byte... n){
  byte result = 0;
  for (byte a : n) {
   result += a;
  }
  return result;
 }
 public static int addInt(List<Integer> n){
  int result = 0;
  for (int a : n) {
   result += a;
  }
  return result;
 }
 public static double addDouble(List<Double> n){
  double result = 0;
  for (double a : n) {
   result += a;
  }
  return result;
 }
 public static float addFloat(List<Float> n){
  float result = 0;
  for (float a : n) {
   result += a;
  }
  return result;
 }
 public static short addShort(List<Short> n){
  short result = 0;
  for (short a : n) {
   result += a;
  }
  return result;
 }
 public static long addLong(List<Long> n){
  long result = 0;
  for (long a : n) {
   result += a;
  }
  return result;
 }
 public static byte addByte(List<Byte> n){
  byte result = 0;
  for (byte a : n) {
   result += a;
  }
  return result;
 }
 public static int[] addInt(int[] a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(((i < a.length) ? a[i] : 0) + ((i < b.length) ? b[i] : 0));
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] addDouble(double[] a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(((i < a.length) ? a[i] : 0) + ((i < b.length) ? b[i] : 0));
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] addFloat(float[] a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(((i < a.length) ? a[i] : 0) + ((i < b.length) ? b[i] : 0));
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] addShort(short[] a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((short)(((i < a.length) ? a[i] : 0) + ((i < b.length) ? b[i] : 0)));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] addLong(long[] a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((long)(((i < a.length) ? a[i] : 0) + ((i < b.length) ? b[i] : 0)));
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] addByte(byte[] a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((byte)(((i < a.length) ? a[i] : 0) + ((i < b.length) ? b[i] : 0)));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> addInt(List<Integer> a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(((i < a.size()) ? a.get(i) : 0) + ((i < b.size()) ? b.get(i) : 0));
  }
  return result;
 }
 public static List<Double> addDouble(List<Double> a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(((i < a.size()) ? a.get(i) : 0) + ((i < b.size()) ? b.get(i) : 0));
  }
  return result;
 }
 public static List<Short> addShort(List<Short> a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((short)(((i < a.size()) ? a.get(i) : 0) + ((i < b.size()) ? b.get(i) : 0)));
  }
  return result;
 }
 public static List<Float> addFloat(List<Float> a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((float)(((i < a.size()) ? a.get(i) : 0) + ((i < b.size()) ? b.get(i) : 0)));
  }
  return result;
 }
 public static List<Long> addLong(List<Long> a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(((i < a.size()) ? a.get(i) : 0) + ((i < b.size()) ? b.get(i) : 0));
  }
  return result;
 }
 public static List<Byte> addByte(List<Byte> a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((byte)(((i < a.size()) ? a.get(i) : 0) + ((i < b.size()) ? b.get(i) : 0)));
  }
  return result;
 }
 public static int[] addInt(int a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add(a + i);
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] addDouble(double a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add(a + i);
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] addFloat(float a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add(a + i);
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] addShort(short a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(a + i));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] addLong(long a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add(a + i);
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] addByte(byte a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(a + i));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> addInt(int a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add(a + i);
  }
  return result;
 }
 public static List<Double> addDouble(double a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add(a + i);
  }
  return result;
 }
 public static List<Float> addFloat(float a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add(a + i);
  }
  return result;
 }
 public static List<Short> addShort(short a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(a + i));
  }
  return result;
 }
 public static List<Long> addLong(long a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add(a + i);
  }
  return result;
 }
 public static List<Byte> addByte(byte a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(a + i));
  }
  return result;
 }
}