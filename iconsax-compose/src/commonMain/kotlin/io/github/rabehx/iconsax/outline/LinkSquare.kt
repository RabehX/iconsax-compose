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

val Iconsax.Outline.LinkSquare: ImageVector
    get() {
        if (_LinkSquare != null) {
            return _LinkSquare!!
        }
        _LinkSquare = ImageVector.Builder(
            name = "Outline.LinkSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.18f, 16.77f)
                curveTo(8.16f, 16.77f, 8.13f, 16.77f, 8.11f, 16.77f)
                curveTo(7.14f, 16.68f, 6.23f, 16.23f, 5.55f, 15.51f)
                curveTo(3.95f, 13.83f, 3.95f, 11.1f, 5.55f, 9.42f)
                lineTo(7.74f, 7.12f)
                curveTo(8.52f, 6.3f, 9.57f, 5.84f, 10.69f, 5.84f)
                curveTo(11.81f, 5.84f, 12.86f, 6.29f, 13.64f, 7.12f)
                curveTo(15.24f, 8.8f, 15.24f, 11.53f, 13.64f, 13.21f)
                lineTo(12.55f, 14.36f)
                curveTo(12.26f, 14.66f, 11.79f, 14.67f, 11.49f, 14.39f)
                curveTo(11.19f, 14.1f, 11.18f, 13.63f, 11.46f, 13.33f)
                lineTo(12.55f, 12.18f)
                curveTo(13.61f, 11.07f, 13.61f, 9.26f, 12.55f, 8.16f)
                curveTo(11.56f, 7.12f, 9.82f, 7.12f, 8.82f, 8.16f)
                lineTo(6.63f, 10.46f)
                curveTo(5.57f, 11.57f, 5.57f, 13.38f, 6.63f, 14.48f)
                curveTo(7.06f, 14.94f, 7.64f, 15.22f, 8.25f, 15.28f)
                curveTo(8.66f, 15.32f, 8.96f, 15.69f, 8.92f, 16.1f)
                curveTo(8.89f, 16.48f, 8.56f, 16.77f, 8.18f, 16.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.31f, 18.16f)
                curveTo(12.19f, 18.16f, 11.14f, 17.71f, 10.36f, 16.88f)
                curveTo(8.76f, 15.2f, 8.76f, 12.47f, 10.36f, 10.79f)
                lineTo(11.45f, 9.64f)
                curveTo(11.74f, 9.34f, 12.21f, 9.33f, 12.51f, 9.61f)
                curveTo(12.81f, 9.9f, 12.82f, 10.37f, 12.54f, 10.67f)
                lineTo(11.45f, 11.82f)
                curveTo(10.39f, 12.93f, 10.39f, 14.74f, 11.45f, 15.84f)
                curveTo(12.44f, 16.88f, 14.18f, 16.89f, 15.18f, 15.84f)
                lineTo(17.37f, 13.54f)
                curveTo(18.43f, 12.43f, 18.43f, 10.62f, 17.37f, 9.52f)
                curveTo(16.94f, 9.06f, 16.36f, 8.78f, 15.75f, 8.72f)
                curveTo(15.34f, 8.68f, 15.04f, 8.31f, 15.08f, 7.9f)
                curveTo(15.12f, 7.49f, 15.48f, 7.18f, 15.9f, 7.23f)
                curveTo(16.87f, 7.33f, 17.78f, 7.77f, 18.46f, 8.49f)
                curveTo(20.06f, 10.17f, 20.06f, 12.9f, 18.46f, 14.58f)
                lineTo(16.27f, 16.88f)
                curveTo(15.48f, 17.71f, 14.43f, 18.16f, 13.31f, 18.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _LinkSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSquare: ImageVector? = null
