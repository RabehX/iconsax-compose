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


val Iconsax.Filled.FormatSquare: ImageVector
    get() {
        if (_FormatSquare != null) {
            return _FormatSquare!!
        }
        _FormatSquare = ImageVector.Builder(
            name = "Filled.FormatSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.75f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21.94f, 7f, 22.75f, 5.83f, 22.75f, 4.5f)
                curveTo(22.75f, 2.71f, 21.29f, 1.25f, 19.5f, 1.25f)
                curveTo(18.18f, 1.25f, 17f, 2.06f, 16.5f, 3.25f)
                horizontalLineTo(7.5f)
                curveTo(7f, 2.06f, 5.83f, 1.25f, 4.5f, 1.25f)
                curveTo(2.71f, 1.25f, 1.25f, 2.71f, 1.25f, 4.5f)
                curveTo(1.25f, 5.82f, 2.06f, 7f, 3.25f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(2.06f, 17f, 1.25f, 18.17f, 1.25f, 19.5f)
                curveTo(1.25f, 21.29f, 2.71f, 22.75f, 4.5f, 22.75f)
                curveTo(5.82f, 22.75f, 7f, 21.94f, 7.5f, 20.75f)
                horizontalLineTo(16.5f)
                curveTo(17f, 21.94f, 18.17f, 22.75f, 19.5f, 22.75f)
                curveTo(21.29f, 22.75f, 22.75f, 21.29f, 22.75f, 19.5f)
                curveTo(22.75f, 18.18f, 21.94f, 17f, 20.75f, 16.5f)
                close()
                moveTo(19.16f, 16.27f)
                curveTo(19.05f, 16.28f, 18.95f, 16.3f, 18.84f, 16.32f)
                curveTo(18.57f, 16.37f, 18.31f, 16.46f, 18.06f, 16.59f)
                curveTo(18f, 16.62f, 17.94f, 16.65f, 17.88f, 16.69f)
                curveTo(17.38f, 16.97f, 16.97f, 17.38f, 16.69f, 17.88f)
                curveTo(16.65f, 17.94f, 16.62f, 18f, 16.59f, 18.06f)
                curveTo(16.46f, 18.31f, 16.37f, 18.57f, 16.32f, 18.84f)
                curveTo(16.3f, 18.95f, 16.28f, 19.05f, 16.27f, 19.16f)
                curveTo(16.26f, 19.19f, 16.26f, 19.22f, 16.26f, 19.25f)
                horizontalLineTo(7.74f)
                curveTo(7.72f, 19f, 7.67f, 18.76f, 7.6f, 18.53f)
                curveTo(7.58f, 18.45f, 7.55f, 18.36f, 7.51f, 18.28f)
                curveTo(7.48f, 18.21f, 7.45f, 18.14f, 7.41f, 18.06f)
                curveTo(7.38f, 18f, 7.35f, 17.94f, 7.31f, 17.88f)
                curveTo(7.03f, 17.38f, 6.62f, 16.97f, 6.12f, 16.69f)
                curveTo(6.06f, 16.65f, 6f, 16.62f, 5.94f, 16.59f)
                curveTo(5.86f, 16.55f, 5.79f, 16.52f, 5.72f, 16.49f)
                curveTo(5.64f, 16.45f, 5.55f, 16.42f, 5.47f, 16.4f)
                curveTo(5.24f, 16.33f, 5f, 16.28f, 4.75f, 16.26f)
                verticalLineTo(7.74f)
                curveTo(5.01f, 7.72f, 5.25f, 7.67f, 5.49f, 7.59f)
                curveTo(5.58f, 7.57f, 5.68f, 7.53f, 5.77f, 7.49f)
                curveTo(5.82f, 7.47f, 5.88f, 7.44f, 5.94f, 7.41f)
                curveTo(6f, 7.38f, 6.06f, 7.35f, 6.12f, 7.31f)
                curveTo(6.62f, 7.03f, 7.03f, 6.62f, 7.31f, 6.12f)
                curveTo(7.35f, 6.06f, 7.38f, 6f, 7.41f, 5.94f)
                curveTo(7.44f, 5.88f, 7.47f, 5.82f, 7.49f, 5.77f)
                curveTo(7.53f, 5.68f, 7.57f, 5.58f, 7.59f, 5.49f)
                curveTo(7.67f, 5.25f, 7.72f, 5.01f, 7.74f, 4.75f)
                horizontalLineTo(16.26f)
                curveTo(16.28f, 5.02f, 16.33f, 5.27f, 16.42f, 5.52f)
                curveTo(16.44f, 5.6f, 16.47f, 5.69f, 16.51f, 5.77f)
                curveTo(16.53f, 5.83f, 16.56f, 5.88f, 16.59f, 5.94f)
                curveTo(16.62f, 6f, 16.65f, 6.06f, 16.69f, 6.12f)
                curveTo(16.97f, 6.62f, 17.38f, 7.03f, 17.88f, 7.31f)
                curveTo(17.94f, 7.35f, 18f, 7.38f, 18.06f, 7.41f)
                curveTo(18.12f, 7.44f, 18.17f, 7.47f, 18.23f, 7.49f)
                curveTo(18.31f, 7.53f, 18.4f, 7.56f, 18.48f, 7.58f)
                curveTo(18.73f, 7.67f, 18.98f, 7.72f, 19.25f, 7.74f)
                verticalLineTo(16.26f)
                curveTo(19.22f, 16.26f, 19.19f, 16.26f, 19.16f, 16.27f)
                close()
            }
        }.build()

        return _FormatSquare!!
    }

@Suppress("ObjectPropertyName")
private var _FormatSquare: ImageVector? = null
