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


val Iconsax.Filled.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Filled.Moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.529f, 15.929f)
                curveTo(21.369f, 15.659f, 20.919f, 15.239f, 19.799f, 15.439f)
                curveTo(19.179f, 15.549f, 18.549f, 15.599f, 17.919f, 15.569f)
                curveTo(15.589f, 15.469f, 13.479f, 14.399f, 12.009f, 12.749f)
                curveTo(10.709f, 11.299f, 9.909f, 9.409f, 9.899f, 7.369f)
                curveTo(9.899f, 6.229f, 10.119f, 5.129f, 10.569f, 4.089f)
                curveTo(11.009f, 3.079f, 10.699f, 2.549f, 10.479f, 2.329f)
                curveTo(10.249f, 2.099f, 9.709f, 1.779f, 8.649f, 2.219f)
                curveTo(4.559f, 3.939f, 2.029f, 8.039f, 2.329f, 12.429f)
                curveTo(2.629f, 16.559f, 5.529f, 20.089f, 9.369f, 21.419f)
                curveTo(10.289f, 21.739f, 11.259f, 21.929f, 12.259f, 21.969f)
                curveTo(12.419f, 21.979f, 12.579f, 21.989f, 12.739f, 21.989f)
                curveTo(16.089f, 21.989f, 19.229f, 20.409f, 21.209f, 17.719f)
                curveTo(21.879f, 16.789f, 21.699f, 16.199f, 21.529f, 15.929f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
