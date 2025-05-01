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


val Iconsax.Filled.LinkSquare: ImageVector
    get() {
        if (_LinkSquare != null) {
            return _LinkSquare!!
        }
        _LinkSquare = ImageVector.Builder(
            name = "Filled.LinkSquare",
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
                moveTo(18.45f, 14.59f)
                lineTo(16.26f, 16.89f)
                curveTo(15.48f, 17.71f, 14.43f, 18.17f, 13.31f, 18.17f)
                curveTo(12.19f, 18.17f, 11.14f, 17.72f, 10.36f, 16.89f)
                curveTo(8.76f, 15.21f, 8.76f, 12.48f, 10.36f, 10.8f)
                lineTo(11.45f, 9.65f)
                curveTo(11.74f, 9.35f, 12.21f, 9.34f, 12.51f, 9.62f)
                curveTo(12.81f, 9.91f, 12.82f, 10.38f, 12.54f, 10.68f)
                lineTo(11.45f, 11.83f)
                curveTo(10.39f, 12.94f, 10.39f, 14.75f, 11.45f, 15.85f)
                curveTo(12.44f, 16.89f, 14.18f, 16.9f, 15.18f, 15.85f)
                lineTo(17.37f, 13.55f)
                curveTo(18.43f, 12.44f, 18.43f, 10.63f, 17.37f, 9.53f)
                curveTo(16.94f, 9.07f, 16.36f, 8.79f, 15.75f, 8.73f)
                curveTo(15.34f, 8.69f, 15.04f, 8.32f, 15.08f, 7.91f)
                curveTo(15.12f, 7.5f, 15.48f, 7.19f, 15.9f, 7.24f)
                curveTo(16.87f, 7.34f, 17.78f, 7.78f, 18.46f, 8.5f)
                curveTo(20.05f, 10.17f, 20.05f, 12.91f, 18.45f, 14.59f)
                close()
            }
        }.build()

        return _LinkSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSquare: ImageVector? = null
