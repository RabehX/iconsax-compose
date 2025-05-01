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


val Iconsax.Filled.Heart: ImageVector
    get() {
        if (_Heart != null) {
            return _Heart!!
        }
        _Heart = ImageVector.Builder(
            name = "Filled.Heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.44f, 3.102f)
                curveTo(14.63f, 3.102f, 13.01f, 3.982f, 12f, 5.332f)
                curveTo(10.99f, 3.982f, 9.37f, 3.102f, 7.56f, 3.102f)
                curveTo(4.49f, 3.102f, 2f, 5.602f, 2f, 8.692f)
                curveTo(2f, 9.882f, 2.19f, 10.982f, 2.52f, 12.002f)
                curveTo(4.1f, 17.002f, 8.97f, 19.992f, 11.38f, 20.812f)
                curveTo(11.72f, 20.932f, 12.28f, 20.932f, 12.62f, 20.812f)
                curveTo(15.03f, 19.992f, 19.9f, 17.002f, 21.48f, 12.002f)
                curveTo(21.81f, 10.982f, 22f, 9.882f, 22f, 8.692f)
                curveTo(22f, 5.602f, 19.51f, 3.102f, 16.44f, 3.102f)
                close()
            }
        }.build()

        return _Heart!!
    }

@Suppress("ObjectPropertyName")
private var _Heart: ImageVector? = null
