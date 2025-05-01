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


val Iconsax.Filled.BookSquare: ImageVector
    get() {
        if (_BookSquare != null) {
            return _BookSquare!!
        }
        _BookSquare = ImageVector.Builder(
            name = "Filled.BookSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(11.5f, 17.25f)
                curveTo(11.5f, 17.61f, 11.14f, 17.85f, 10.81f, 17.71f)
                curveTo(9.6f, 17.19f, 8.02f, 16.71f, 6.92f, 16.57f)
                lineTo(6.73f, 16.55f)
                curveTo(6.12f, 16.47f, 5.62f, 15.9f, 5.62f, 15.28f)
                verticalLineTo(7.58f)
                curveTo(5.62f, 6.81f, 6.24f, 6.24f, 7f, 6.3f)
                curveTo(8.25f, 6.4f, 10.1f, 7f, 11.26f, 7.66f)
                curveTo(11.42f, 7.75f, 11.5f, 7.92f, 11.5f, 8.09f)
                verticalLineTo(17.25f)
                close()
                moveTo(18.38f, 15.27f)
                curveTo(18.38f, 15.89f, 17.88f, 16.46f, 17.27f, 16.54f)
                lineTo(17.06f, 16.56f)
                curveTo(15.97f, 16.71f, 14.4f, 17.18f, 13.19f, 17.69f)
                curveTo(12.86f, 17.83f, 12.5f, 17.59f, 12.5f, 17.23f)
                verticalLineTo(8.08f)
                curveTo(12.5f, 7.9f, 12.59f, 7.73f, 12.75f, 7.64f)
                curveTo(13.91f, 6.99f, 15.72f, 6.41f, 16.95f, 6.3f)
                horizontalLineTo(16.99f)
                curveTo(17.76f, 6.3f, 18.38f, 6.92f, 18.38f, 7.69f)
                verticalLineTo(15.27f)
                close()
            }
        }.build()

        return _BookSquare!!
    }

@Suppress("ObjectPropertyName")
private var _BookSquare: ImageVector? = null
