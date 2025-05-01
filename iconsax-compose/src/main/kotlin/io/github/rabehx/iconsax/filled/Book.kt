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


val Iconsax.Filled.Book: ImageVector
    get() {
        if (_Book != null) {
            return _Book!!
        }
        _Book = ImageVector.Builder(
            name = "Filled.Book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 16f)
                verticalLineTo(18.5f)
                curveTo(20.5f, 20.43f, 18.93f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(5.07f, 22f, 3.5f, 20.43f, 3.5f, 18.5f)
                verticalLineTo(17.85f)
                curveTo(3.5f, 16.28f, 4.78f, 15f, 6.35f, 15f)
                horizontalLineTo(19.5f)
                curveTo(20.05f, 15f, 20.5f, 15.45f, 20.5f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 2f)
                horizontalLineTo(8.5f)
                curveTo(4.5f, 2f, 3.5f, 3f, 3.5f, 7f)
                verticalLineTo(14.58f)
                curveTo(4.26f, 13.91f, 5.26f, 13.5f, 6.35f, 13.5f)
                horizontalLineTo(19.5f)
                curveTo(20.05f, 13.5f, 20.5f, 13.05f, 20.5f, 12.5f)
                verticalLineTo(7f)
                curveTo(20.5f, 3f, 19.5f, 2f, 15.5f, 2f)
                close()
                moveTo(13f, 10.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 10.75f, 7.25f, 10.41f, 7.25f, 10f)
                curveTo(7.25f, 9.59f, 7.59f, 9.25f, 8f, 9.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 9.25f, 13.75f, 9.59f, 13.75f, 10f)
                curveTo(13.75f, 10.41f, 13.41f, 10.75f, 13f, 10.75f)
                close()
                moveTo(16f, 7.25f)
                horizontalLineTo(8f)
                curveTo(7.59f, 7.25f, 7.25f, 6.91f, 7.25f, 6.5f)
                curveTo(7.25f, 6.09f, 7.59f, 5.75f, 8f, 5.75f)
                horizontalLineTo(16f)
                curveTo(16.41f, 5.75f, 16.75f, 6.09f, 16.75f, 6.5f)
                curveTo(16.75f, 6.91f, 16.41f, 7.25f, 16f, 7.25f)
                close()
            }
        }.build()

        return _Book!!
    }

@Suppress("ObjectPropertyName")
private var _Book: ImageVector? = null
