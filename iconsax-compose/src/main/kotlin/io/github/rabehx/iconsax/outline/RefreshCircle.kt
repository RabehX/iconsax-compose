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

val Iconsax.Outline.RefreshCircle: ImageVector
    get() {
        if (_RefreshCircle != null) {
            return _RefreshCircle!!
        }
        _RefreshCircle = ImageVector.Builder(
            name = "Outline.RefreshCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.47f)
                curveTo(10.599f, 17.47f, 9.199f, 16.94f, 8.129f, 15.87f)
                curveTo(7.849f, 15.59f, 7.599f, 15.28f, 7.369f, 14.91f)
                curveTo(7.149f, 14.56f, 7.259f, 14.1f, 7.609f, 13.88f)
                curveTo(7.959f, 13.66f, 8.419f, 13.77f, 8.639f, 14.12f)
                curveTo(8.809f, 14.4f, 8.989f, 14.62f, 9.189f, 14.82f)
                curveTo(10.74f, 16.37f, 13.259f, 16.37f, 14.809f, 14.82f)
                curveTo(15.409f, 14.22f, 15.79f, 13.44f, 15.92f, 12.57f)
                curveTo(15.979f, 12.16f, 16.359f, 11.86f, 16.769f, 11.93f)
                curveTo(17.179f, 11.99f, 17.459f, 12.37f, 17.41f, 12.78f)
                curveTo(17.24f, 13.97f, 16.709f, 15.04f, 15.88f, 15.88f)
                curveTo(14.8f, 16.94f, 13.399f, 17.47f, 12f, 17.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.34f, 12.08f)
                curveTo(7.3f, 12.08f, 7.27f, 12.08f, 7.23f, 12.07f)
                curveTo(6.82f, 12.01f, 6.53f, 11.63f, 6.59f, 11.22f)
                curveTo(6.76f, 10.03f, 7.29f, 8.96f, 8.12f, 8.12f)
                curveTo(10.25f, 5.99f, 13.72f, 5.99f, 15.86f, 8.12f)
                curveTo(16.14f, 8.4f, 16.39f, 8.71f, 16.62f, 9.09f)
                curveTo(16.84f, 9.44f, 16.73f, 9.9f, 16.38f, 10.12f)
                curveTo(16.03f, 10.34f, 15.57f, 10.23f, 15.35f, 9.88f)
                curveTo(15.18f, 9.61f, 15f, 9.38f, 14.8f, 9.18f)
                curveTo(13.25f, 7.63f, 10.73f, 7.63f, 9.18f, 9.18f)
                curveTo(8.58f, 9.78f, 8.2f, 10.56f, 8.07f, 11.43f)
                curveTo(8.03f, 11.81f, 7.71f, 12.08f, 7.34f, 12.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.82f, 17.93f)
                curveTo(7.41f, 17.93f, 7.07f, 17.59f, 7.07f, 17.18f)
                verticalLineTo(14.51f)
                curveTo(7.07f, 14.1f, 7.41f, 13.76f, 7.82f, 13.76f)
                horizontalLineTo(10.49f)
                curveTo(10.9f, 13.76f, 11.24f, 14.1f, 11.24f, 14.51f)
                curveTo(11.24f, 14.92f, 10.9f, 15.26f, 10.49f, 15.26f)
                horizontalLineTo(8.57f)
                verticalLineTo(17.18f)
                curveTo(8.57f, 17.59f, 8.24f, 17.93f, 7.82f, 17.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.18f, 10.24f)
                horizontalLineTo(13.51f)
                curveTo(13.1f, 10.24f, 12.76f, 9.9f, 12.76f, 9.49f)
                curveTo(12.76f, 9.08f, 13.1f, 8.74f, 13.51f, 8.74f)
                horizontalLineTo(15.43f)
                verticalLineTo(6.82f)
                curveTo(15.43f, 6.41f, 15.77f, 6.07f, 16.18f, 6.07f)
                curveTo(16.59f, 6.07f, 16.93f, 6.41f, 16.93f, 6.82f)
                verticalLineTo(9.49f)
                curveTo(16.93f, 9.91f, 16.59f, 10.24f, 16.18f, 10.24f)
                close()
            }
        }.build()

        return _RefreshCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCircle: ImageVector? = null
