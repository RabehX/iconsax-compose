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

val Iconsax.Filled.ArrowSquare: ImageVector
    get() {
        if (_ArrowSquare != null) {
            return _ArrowSquare!!
        }
        _ArrowSquare = ImageVector.Builder(
            name = "Filled.ArrowSquare",
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
                moveTo(19.35f, 8.84f)
                curveTo(19.31f, 8.93f, 19.26f, 9.01f, 19.19f, 9.08f)
                lineTo(17.39f, 10.88f)
                curveTo(17.24f, 11.03f, 17.05f, 11.1f, 16.86f, 11.1f)
                curveTo(16.67f, 11.1f, 16.48f, 11.03f, 16.33f, 10.88f)
                curveTo(16.04f, 10.59f, 16.04f, 10.11f, 16.33f, 9.82f)
                lineTo(16.85f, 9.3f)
                horizontalLineTo(16.7f)
                curveTo(14.6f, 9.3f, 12.88f, 11.01f, 12.88f, 13.11f)
                verticalLineTo(15.07f)
                verticalLineTo(17.24f)
                curveTo(12.88f, 17.65f, 12.54f, 17.99f, 12.13f, 17.99f)
                curveTo(11.72f, 17.99f, 11.38f, 17.65f, 11.38f, 17.24f)
                verticalLineTo(15.07f)
                verticalLineTo(13.11f)
                curveTo(11.38f, 11.01f, 9.67f, 9.3f, 7.57f, 9.3f)
                horizontalLineTo(7.15f)
                lineTo(7.67f, 9.82f)
                curveTo(7.96f, 10.11f, 7.96f, 10.59f, 7.67f, 10.88f)
                curveTo(7.52f, 11.03f, 7.33f, 11.1f, 7.14f, 11.1f)
                curveTo(6.95f, 11.1f, 6.76f, 11.03f, 6.61f, 10.88f)
                lineTo(4.81f, 9.08f)
                curveTo(4.52f, 8.79f, 4.52f, 8.31f, 4.81f, 8.02f)
                lineTo(6.61f, 6.22f)
                curveTo(6.9f, 5.93f, 7.38f, 5.93f, 7.67f, 6.22f)
                curveTo(7.96f, 6.51f, 7.96f, 6.99f, 7.67f, 7.28f)
                lineTo(7.15f, 7.8f)
                horizontalLineTo(7.58f)
                curveTo(9.53f, 7.8f, 11.22f, 8.87f, 12.14f, 10.44f)
                curveTo(13.06f, 8.87f, 14.75f, 7.8f, 16.71f, 7.8f)
                horizontalLineTo(16.86f)
                lineTo(16.34f, 7.28f)
                curveTo(16.05f, 6.99f, 16.05f, 6.51f, 16.34f, 6.22f)
                curveTo(16.63f, 5.93f, 17.11f, 5.93f, 17.4f, 6.22f)
                lineTo(19.2f, 8.02f)
                curveTo(19.27f, 8.09f, 19.32f, 8.17f, 19.36f, 8.26f)
                curveTo(19.43f, 8.45f, 19.43f, 8.66f, 19.35f, 8.84f)
                close()
            }
        }.build()

        return _ArrowSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquare: ImageVector? = null
