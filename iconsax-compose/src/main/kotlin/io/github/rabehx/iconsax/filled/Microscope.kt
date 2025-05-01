/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Microscope: ImageVector
    get() {
        if (_Microscope != null) {
            return _Microscope!!
        }
        _Microscope = ImageVector.Builder(
            name = "Filled.Microscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.841f, 10.899f)
                lineTo(20.501f, 7.109f)
                curveTo(21.071f, 6.729f, 21.221f, 5.949f, 20.841f, 5.389f)
                lineTo(19.021f, 2.679f)
                curveTo(18.641f, 2.109f, 17.861f, 1.959f, 17.301f, 2.339f)
                lineTo(11.641f, 6.129f)
                lineTo(14.841f, 10.899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.52f, 10.422f)
                lineTo(12.76f, 11.602f)
                lineTo(10.09f, 13.392f)
                lineTo(9.74f, 13.622f)
                lineTo(9.58f, 13.382f)
                lineTo(7.34f, 10.042f)
                lineTo(7.18f, 9.802f)
                lineTo(11.96f, 6.602f)
                lineTo(14.52f, 10.422f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.639f, 16.019f)
                lineTo(9.589f, 13.379f)
                lineTo(7.349f, 10.039f)
                lineTo(3.399f, 12.679f)
                curveTo(2.939f, 12.989f, 2.819f, 13.609f, 3.129f, 14.069f)
                lineTo(4.259f, 15.749f)
                curveTo(4.559f, 16.209f, 5.179f, 16.329f, 5.639f, 16.019f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.559f, 21.812f)
                curveTo(16.459f, 21.852f, 16.349f, 21.882f, 16.249f, 21.882f)
                curveTo(15.959f, 21.882f, 15.689f, 21.712f, 15.559f, 21.432f)
                lineTo(11.829f, 13.192f)
                lineTo(8.049f, 21.442f)
                curveTo(7.919f, 21.712f, 7.649f, 21.882f, 7.359f, 21.882f)
                curveTo(7.259f, 21.882f, 7.149f, 21.852f, 7.049f, 21.812f)
                curveTo(6.679f, 21.632f, 6.509f, 21.192f, 6.679f, 20.812f)
                lineTo(10.089f, 13.392f)
                lineTo(12.759f, 11.602f)
                lineTo(16.929f, 20.822f)
                curveTo(17.099f, 21.192f, 16.929f, 21.642f, 16.559f, 21.812f)
                close()
            }
        }.build()

        return _Microscope!!
    }

@Suppress("ObjectPropertyName")
private var _Microscope: ImageVector? = null
