/*
 * Copyright (C) 25/04/13 Romain Reuillon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.geocites.simpoplocal.exploration

object Median {

  def median(sequence: Iterable[Double]): Double = {
    val sortedSerie = sequence.toArray.filterNot(_.isNaN).sorted
    val size = sortedSerie.size
    if (size == sequence.size)
      if (size % 2 == 0) (sortedSerie(size / 2) + sortedSerie((size / 2) - 1)) / 2
      else sortedSerie((size / 2))
    else Double.NaN
  }

  def apply(arr: Array[Double]) = median(arr)

}