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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Book: ImageVector
    get() {
        if (_Book != null) {
            return _Book!!
        }
        _Book = ImageVector.Builder(
            name = "Outline.Book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.5f, 18.75f)
                curveTo(3.09f, 18.75f, 2.75f, 18.41f, 2.75f, 18f)
                verticalLineTo(7f)
                curveTo(2.75f, 2.59f, 4.09f, 1.25f, 8.5f, 1.25f)
                horizontalLineTo(15.5f)
                curveTo(19.91f, 1.25f, 21.25f, 2.59f, 21.25f, 7f)
                verticalLineTo(17f)
                curveTo(21.25f, 17.16f, 21.25f, 17.31f, 21.24f, 17.47f)
                curveTo(21.21f, 17.88f, 20.84f, 18.2f, 20.44f, 18.17f)
                curveTo(20.03f, 18.14f, 19.71f, 17.78f, 19.74f, 17.37f)
                curveTo(19.75f, 17.25f, 19.75f, 17.12f, 19.75f, 17f)
                verticalLineTo(7f)
                curveTo(19.75f, 3.43f, 19.08f, 2.75f, 15.5f, 2.75f)
                horizontalLineTo(8.5f)
                curveTo(4.92f, 2.75f, 4.25f, 3.43f, 4.25f, 7f)
                verticalLineTo(18f)
                curveTo(4.25f, 18.41f, 3.91f, 18.75f, 3.5f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(4.66f, 22.75f, 2.75f, 20.84f, 2.75f, 18.5f)
                verticalLineTo(17.85f)
                curveTo(2.75f, 15.86f, 4.37f, 14.25f, 6.35f, 14.25f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 14.25f, 21.25f, 14.59f, 21.25f, 15f)
                verticalLineTo(18.5f)
                curveTo(21.25f, 20.84f, 19.34f, 22.75f, 17f, 22.75f)
                close()
                moveTo(6.35f, 15.75f)
                curveTo(5.19f, 15.75f, 4.25f, 16.69f, 4.25f, 17.85f)
                verticalLineTo(18.5f)
                curveTo(4.25f, 20.02f, 5.48f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(18.52f, 21.25f, 19.75f, 20.02f, 19.75f, 18.5f)
                verticalLineTo(15.75f)
                horizontalLineTo(6.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 7.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 7.75f, 7.25f, 7.41f, 7.25f, 7f)
                curveTo(7.25f, 6.59f, 7.59f, 6.25f, 8f, 6.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 6.25f, 16.75f, 6.59f, 16.75f, 7f)
                curveTo(16.75f, 7.41f, 16.41f, 7.75f, 16f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 11.25f)
                horizontalLineTo(8f)
                curveTo(7.59f, 11.25f, 7.25f, 10.91f, 7.25f, 10.5f)
                curveTo(7.25f, 10.09f, 7.59f, 9.75f, 8f, 9.75f)
                horizontalLineTo(13f)
                curveTo(13.41f, 9.75f, 13.75f, 10.09f, 13.75f, 10.5f)
                curveTo(13.75f, 10.91f, 13.41f, 11.25f, 13f, 11.25f)
                close()
            }
        }.build()

        return _Book!!
    }

@Suppress("ObjectPropertyName")
private var _Book: ImageVector? = null
