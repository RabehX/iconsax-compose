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


val Iconsax.Filled.Frame4: ImageVector
    get() {
        if (_Frame4 != null) {
            return _Frame4!!
        }
        _Frame4 = ImageVector.Builder(
            name = "Filled.Frame4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.02f, 4.621f)
                horizontalLineTo(6.98f)
                curveTo(5.39f, 4.621f, 4.75f, 5.221f, 4.75f, 6.741f)
                verticalLineTo(18.621f)
                horizontalLineTo(10.25f)
                verticalLineTo(6.741f)
                curveTo(10.24f, 5.221f, 9.6f, 4.621f, 8.02f, 4.621f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.52f, 9.621f)
                horizontalLineTo(15.48f)
                curveTo(13.89f, 9.621f, 13.25f, 10.231f, 13.25f, 11.741f)
                verticalLineTo(18.621f)
                horizontalLineTo(18.75f)
                verticalLineTo(11.741f)
                curveTo(18.75f, 10.231f, 18.1f, 9.621f, 16.52f, 9.621f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.75f, 17.879f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 17.879f, 22f, 18.219f, 22f, 18.629f)
                curveTo(22f, 19.039f, 21.66f, 19.379f, 21.25f, 19.379f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 19.379f, 2f, 19.039f, 2f, 18.619f)
                curveTo(2f, 18.199f, 2.34f, 17.879f, 2.75f, 17.879f)
                close()
            }
        }.build()

        return _Frame4!!
    }

@Suppress("ObjectPropertyName")
private var _Frame4: ImageVector? = null
