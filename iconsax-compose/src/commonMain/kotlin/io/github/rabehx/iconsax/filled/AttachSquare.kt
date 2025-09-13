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

val Iconsax.Filled.AttachSquare: ImageVector
    get() {
        if (_AttachSquare != null) {
            return _AttachSquare!!
        }
        _AttachSquare = ImageVector.Builder(
            name = "Filled.AttachSquare",
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
                moveTo(16.37f, 14.35f)
                lineTo(14.15f, 16.57f)
                curveTo(13.61f, 17.11f, 12.91f, 17.37f, 12.21f, 17.37f)
                curveTo(11.51f, 17.37f, 10.8f, 17.1f, 10.27f, 16.57f)
                curveTo(9.75f, 16.05f, 9.46f, 15.36f, 9.46f, 14.63f)
                curveTo(9.46f, 13.9f, 9.75f, 13.2f, 10.27f, 12.69f)
                lineTo(11.68f, 11.28f)
                curveTo(11.97f, 10.99f, 12.45f, 10.99f, 12.74f, 11.28f)
                curveTo(13.03f, 11.57f, 13.03f, 12.05f, 12.74f, 12.34f)
                lineTo(11.33f, 13.75f)
                curveTo(11.09f, 13.99f, 10.96f, 14.3f, 10.96f, 14.63f)
                curveTo(10.96f, 14.96f, 11.09f, 15.28f, 11.33f, 15.51f)
                curveTo(11.82f, 16f, 12.61f, 16f, 13.1f, 15.51f)
                lineTo(15.32f, 13.29f)
                curveTo(16.59f, 12.02f, 16.59f, 9.96f, 15.32f, 8.69f)
                curveTo(14.05f, 7.42f, 11.99f, 7.42f, 10.72f, 8.69f)
                lineTo(8.3f, 11.11f)
                curveTo(7.79f, 11.62f, 7.51f, 12.29f, 7.51f, 13f)
                curveTo(7.51f, 13.71f, 7.79f, 14.39f, 8.3f, 14.89f)
                curveTo(8.59f, 15.18f, 8.59f, 15.66f, 8.3f, 15.95f)
                curveTo(8.01f, 16.24f, 7.53f, 16.24f, 7.24f, 15.95f)
                curveTo(6.44f, 15.18f, 6f, 14.13f, 6f, 13.01f)
                curveTo(6f, 11.89f, 6.43f, 10.84f, 7.22f, 10.05f)
                lineTo(9.64f, 7.63f)
                curveTo(11.49f, 5.78f, 14.51f, 5.78f, 16.36f, 7.63f)
                curveTo(18.22f, 9.48f, 18.22f, 12.5f, 16.37f, 14.35f)
                close()
            }
        }.build()

        return _AttachSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AttachSquare: ImageVector? = null
