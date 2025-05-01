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

val Iconsax.Filled.ArrangeSquare2: ImageVector
    get() {
        if (_ArrangeSquare2 != null) {
            return _ArrangeSquare2!!
        }
        _ArrangeSquare2 = ImageVector.Builder(
            name = "Filled.ArrangeSquare2",
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
                moveTo(10.93f, 17.15f)
                curveTo(10.93f, 17.25f, 10.91f, 17.34f, 10.87f, 17.44f)
                curveTo(10.79f, 17.62f, 10.65f, 17.77f, 10.46f, 17.85f)
                curveTo(10.37f, 17.89f, 10.27f, 17.91f, 10.17f, 17.91f)
                curveTo(10.07f, 17.91f, 9.98f, 17.89f, 9.88f, 17.85f)
                curveTo(9.79f, 17.81f, 9.71f, 17.76f, 9.64f, 17.69f)
                lineTo(6.6f, 14.65f)
                curveTo(6.31f, 14.36f, 6.31f, 13.88f, 6.6f, 13.59f)
                curveTo(6.89f, 13.3f, 7.37f, 13.3f, 7.66f, 13.59f)
                lineTo(9.42f, 15.35f)
                verticalLineTo(6.85f)
                curveTo(9.42f, 6.44f, 9.76f, 6.1f, 10.17f, 6.1f)
                curveTo(10.58f, 6.1f, 10.92f, 6.44f, 10.92f, 6.85f)
                verticalLineTo(17.15f)
                horizontalLineTo(10.93f)
                close()
                moveTo(17.39f, 10.42f)
                curveTo(17.24f, 10.57f, 17.05f, 10.64f, 16.86f, 10.64f)
                curveTo(16.67f, 10.64f, 16.48f, 10.57f, 16.33f, 10.42f)
                lineTo(14.57f, 8.66f)
                verticalLineTo(17.16f)
                curveTo(14.57f, 17.57f, 14.23f, 17.91f, 13.82f, 17.91f)
                curveTo(13.41f, 17.91f, 13.07f, 17.57f, 13.07f, 17.16f)
                verticalLineTo(6.85f)
                curveTo(13.07f, 6.75f, 13.09f, 6.66f, 13.13f, 6.56f)
                curveTo(13.21f, 6.38f, 13.35f, 6.23f, 13.54f, 6.15f)
                curveTo(13.72f, 6.07f, 13.93f, 6.07f, 14.11f, 6.15f)
                curveTo(14.2f, 6.19f, 14.28f, 6.24f, 14.35f, 6.31f)
                lineTo(17.39f, 9.35f)
                curveTo(17.68f, 9.65f, 17.68f, 10.12f, 17.39f, 10.42f)
                close()
            }
        }.build()

        return _ArrangeSquare2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrangeSquare2: ImageVector? = null
