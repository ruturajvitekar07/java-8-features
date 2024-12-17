package com.methodreference;

import java.util.*;

// Reference to an instance method of a particular object
class Person {

	private String name;
	private Integer age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Integer getAge() { return age; }
	public String getName() { return name; }
}

class ComparisonProvider {

	public int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}

	public int compareByAge(Person a, Person b) {
		return a.getAge().compareTo(b.getAge());
	}
}

public class MethodReference1 {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("vicky", 24));
		personList.add(new Person("poonam", 25));
		personList.add(new Person("sachin", 19));

		ComparisonProvider comparator = new ComparisonProvider();

		Collections.sort(personList, comparator::compareByName);

		System.out.println("Sort by name :");

		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);

		System.out.println();

		Collections.sort(personList, comparator::compareByAge);

		System.out.println("Sort by age :");

		personList.stream()
			.map(x -> x.getName())
			.forEach(System.out::println);
	}
}