package com.thinhnv.arrayobject.object;

public class ArrayPerson {
	public int size;
	public int nElements;
	public Person[] arrPerson;

	// ---------------------------- Constructor method
	// ----------------------------//
	public ArrayPerson(int numberOfPeople) {
		this.size = numberOfPeople;
		this.arrPerson = new Person[size];
		this.nElements = 0;
		for (int i = 0; i < size; i++) {
			this.arrPerson[i] = null;
		}
	}

	// ----------------------------Find person----------------------------//
	public Person findPerson(String lastName) {
		Person person = null;
		for (int i = 0; i < this.nElements; i++) {
			if (arrPerson[i].getLastName().equals(lastName) == true) {
				person = arrPerson[i];
				break;
			}
		}
		return person;
	}

	// ----------------------------Insert person----------------------------//
	public void insertPerson(String firstName, String lastName, int age) {
		arrPerson[nElements] = new Person(firstName, lastName, age);
		nElements++;
	}

	public void insertPerson(Person person) {
		arrPerson[nElements] = person;
		nElements++;
	}

	// ---------------------------- delete person----------------------------//
	public void deletePerson(String lastName) {
		for (int i = 0; i < nElements; i++) {
			if (arrPerson[i].getLastName().equals(lastName)) {
				for (int j = i; j < nElements-1; j++) {
					arrPerson[j] = arrPerson[j + 1];
				}
				--nElements;
				--i;
			}
		}
	}

	// ---------------------------- display all people
	// ----------------------------//
	public void displayAll() {
		for (int i = 0; i < nElements; i++) {
//			if (arrPerson[i] != null) {
				System.out.println("");
				arrPerson[i].displayInfor();
//			}
		}
	}

	// ---------------------------- sortByLastName by using quickSort
	// ----------------------------//
	public void sortPerson() {
		quickSort(arrPerson, 0, nElements - 1);
	}

	private int partition(Person arr[], int low, int high) {
		int pivot = arr[high].getAge();
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j].getAge() <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				Person temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		Person temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be sorted,
	 * low --> Starting index, high --> Ending index
	 */
	private void quickSort(Person arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

}
