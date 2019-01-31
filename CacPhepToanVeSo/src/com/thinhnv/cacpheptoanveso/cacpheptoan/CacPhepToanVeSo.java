package com.thinhnv.cacpheptoanveso.cacpheptoan;

public class CacPhepToanVeSo {
	private int soA;
	private String ketQua = "";

	public CacPhepToanVeSo(int soA) {
		this.soA = soA;
	}

	public void phanTichThuaSoNguyenTo() {// Time comlexity : O(n) if n is prime number
		if (this.soA == 1 || this.soA == 2) {
			this.ketQua += this.soA;
			return;
		}
		int temp = this.soA;
		for (int i = 2; i <= temp; i++) {
			while (temp % i == 0) {
				temp /= i;
				this.ketQua += temp == 1 ? i : (i + "*");
			}
		}
	}


	public String getKQ() {
		return this.soA + " = " + this.ketQua;
	}
//
//	public int nthPrime(int n) {
//	    if (n < 2) return 2;
//	    if (n == 2) return 3;
//	    int limit, root, count = 1;
//	    limit = (int)(n*(Math.log(n) + Math.log(Math.log(n)))) + 3;
//	    root = (int)Math.sqrt(limit) + 1;
//	    limit = (limit-1)/2;
//	    root = root/2 - 1;
//	    boolean[] sieve = new boolean[limit];
//	    for(int i = 0; i < root; ++i) {
//	        if (!sieve[i]) {
//	            ++count;
//	            for(int j = 2*i*(i+3)+3, p = 2*i+3; j < limit; j += p) {
//	                sieve[j] = true;
//	            }
//	        }
//	    }
//	    int p;
//	    for(p = root; count < n; ++p) {
//	        if (!sieve[p]) {
//	            ++count;
//	        }
//	    }
//	    return 2*p+1;
//	}
//}

	// this will find faster
	// Count number of set bits in an int
	private int popCount(int n) {
		n -= (n >>> 1) & 0x55555555;
		n = ((n >>> 2) & 0x33333333) + (n & 0x33333333);
		n = ((n >> 4) & 0x0F0F0F0F) + (n & 0x0F0F0F0F);
		return (n * 0x01010101) >> 24;
	}

	// Speed up counting by counting the primes per
	// array slot and not individually. This yields
	// another factor of about 1.24 or so.
	public int nthPrime(int n) {
		if (n < 2)
			return 2;
		if (n == 2)
			return 3;
		if (n == 3)
			return 5;
		int limit, root, count = 2;
		limit = (int) (n * (Math.log(n) + Math.log(Math.log(n)))) + 3;
		root = (int) Math.sqrt(limit);
		switch (limit % 6) {
		case 0:
			limit = 2 * (limit / 6) - 1;
			break;
		case 5:
			limit = 2 * (limit / 6) + 1;
			break;
		default:
			limit = 2 * (limit / 6);
		}
		switch (root % 6) {
		case 0:
			root = 2 * (root / 6) - 1;
			break;
		case 5:
			root = 2 * (root / 6) + 1;
			break;
		default:
			root = 2 * (root / 6);
		}
		int dim = (limit + 31) >> 5;
		int[] sieve = new int[dim];
		for (int i = 0; i < root; ++i) {
			if ((sieve[i >> 5] & (1 << (i & 31))) == 0) {
				int start, s1, s2;
				if ((i & 1) == 1) {
					start = i * (3 * i + 8) + 4;
					s1 = 4 * i + 5;
					s2 = 2 * i + 3;
				} else {
					start = i * (3 * i + 10) + 7;
					s1 = 2 * i + 3;
					s2 = 4 * i + 7;
				}
				for (int j = start; j < limit; j += s2) {
					sieve[j >> 5] |= 1 << (j & 31);
					j += s1;
					if (j >= limit)
						break;
					sieve[j >> 5] |= 1 << (j & 31);
				}
			}
		}
		int i;
		for (i = 0; count < n; ++i) {
			count += popCount(~sieve[i]);
		}
		--i;
		int mask = ~sieve[i];
		int p;
		for (p = 31; count >= n; --p) {
			count -= (mask >> p) & 1;
		}
		return 3 * (p + (i << 5)) + 7 + (p & 1);
	}
}