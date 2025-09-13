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


val Iconsax.Filled.Category2: ImageVector
    get() {
        if (_Category2 != null) {
            return _Category2!!
        }
        _Category2 = ImageVector.Builder(
            name = "Filled.Category2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.67f, 2f)
                horizontalLineTo(16.77f)
                curveTo(14.59f, 2f, 13.439f, 3.15f, 13.439f, 5.33f)
                verticalLineTo(7.23f)
                curveTo(13.439f, 9.41f, 14.59f, 10.56f, 16.77f, 10.56f)
                horizontalLineTo(18.67f)
                curveTo(20.85f, 10.56f, 22f, 9.41f, 22f, 7.23f)
                verticalLineTo(5.33f)
                curveTo(22f, 3.15f, 20.85f, 2f, 18.67f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.24f, 13.43f)
                horizontalLineTo(5.34f)
                curveTo(3.15f, 13.43f, 2f, 14.58f, 2f, 16.76f)
                verticalLineTo(18.66f)
                curveTo(2f, 20.85f, 3.15f, 22f, 5.33f, 22f)
                horizontalLineTo(7.23f)
                curveTo(9.41f, 22f, 10.56f, 20.85f, 10.56f, 18.67f)
                verticalLineTo(16.77f)
                curveTo(10.57f, 14.58f, 9.42f, 13.43f, 7.24f, 13.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.29f, 10.58f)
                curveTo(8.659f, 10.58f, 10.58f, 8.659f, 10.58f, 6.29f)
                curveTo(10.58f, 3.921f, 8.659f, 2f, 6.29f, 2f)
                curveTo(3.921f, 2f, 2f, 3.921f, 2f, 6.29f)
                curveTo(2f, 8.659f, 3.921f, 10.58f, 6.29f, 10.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.71f, 22.002f)
                curveTo(20.079f, 22.002f, 22f, 20.081f, 22f, 17.712f)
                curveTo(22f, 15.343f, 20.079f, 13.422f, 17.71f, 13.422f)
                curveTo(15.341f, 13.422f, 13.42f, 15.343f, 13.42f, 17.712f)
                curveTo(13.42f, 20.081f, 15.341f, 22.002f, 17.71f, 22.002f)
                close()
            }
        }.build()

        return _Category2!!
    }

@Suppress("ObjectPropertyName")
private var _Category2: ImageVector? = null
