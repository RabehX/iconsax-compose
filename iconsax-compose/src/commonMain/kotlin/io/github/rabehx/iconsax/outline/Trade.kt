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

val Iconsax.Outline.Trade: ImageVector
    get() {
        if (_Trade != null) {
            return _Trade!!
        }
        _Trade = ImageVector.Builder(
            name = "Outline.Trade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 15.75f)
                curveTo(15.32f, 15.75f, 15.12f, 15.74f, 14.93f, 15.73f)
                curveTo(14.56f, 15.71f, 14.26f, 15.41f, 14.23f, 15.04f)
                curveTo(14.01f, 12.25f, 11.74f, 9.99f, 8.96f, 9.77f)
                curveTo(8.59f, 9.74f, 8.29f, 9.44f, 8.27f, 9.07f)
                curveTo(8.26f, 8.88f, 8.25f, 8.69f, 8.25f, 8.5f)
                curveTo(8.25f, 4.5f, 11.5f, 1.25f, 15.5f, 1.25f)
                curveTo(19.5f, 1.25f, 22.75f, 4.5f, 22.75f, 8.5f)
                curveTo(22.75f, 12.5f, 19.5f, 15.75f, 15.5f, 15.75f)
                close()
                moveTo(9.75f, 8.36f)
                curveTo(12.73f, 8.88f, 15.12f, 11.27f, 15.64f, 14.25f)
                curveTo(18.75f, 14.17f, 21.25f, 11.63f, 21.25f, 8.5f)
                curveTo(21.25f, 5.33f, 18.67f, 2.75f, 15.5f, 2.75f)
                curveTo(12.38f, 2.75f, 9.83f, 5.25f, 9.75f, 8.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 22.75f)
                curveTo(4.5f, 22.75f, 1.25f, 19.5f, 1.25f, 15.5f)
                curveTo(1.25f, 11.5f, 4.5f, 8.25f, 8.5f, 8.25f)
                curveTo(8.68f, 8.25f, 8.88f, 8.26f, 9.07f, 8.27f)
                curveTo(12.6f, 8.55f, 15.46f, 11.41f, 15.73f, 14.92f)
                curveTo(15.74f, 15.12f, 15.75f, 15.31f, 15.75f, 15.5f)
                curveTo(15.75f, 19.5f, 12.5f, 22.75f, 8.5f, 22.75f)
                close()
                moveTo(8.5f, 9.75f)
                curveTo(5.33f, 9.75f, 2.75f, 12.33f, 2.75f, 15.5f)
                curveTo(2.75f, 18.67f, 5.33f, 21.25f, 8.5f, 21.25f)
                curveTo(11.67f, 21.25f, 14.25f, 18.67f, 14.25f, 15.5f)
                curveTo(14.25f, 15.34f, 14.24f, 15.18f, 14.23f, 15.03f)
                curveTo(14.01f, 12.26f, 11.75f, 9.99f, 8.96f, 9.77f)
                curveTo(8.82f, 9.76f, 8.66f, 9.75f, 8.5f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 7.34f)
                curveTo(2.77f, 7.34f, 2.55f, 7.3f, 2.33f, 7.21f)
                curveTo(1.67f, 6.94f, 1.25f, 6.3f, 1.25f, 5.59f)
                verticalLineTo(3f)
                curveTo(1.25f, 2.04f, 2.04f, 1.25f, 3f, 1.25f)
                horizontalLineTo(5.59f)
                curveTo(6.3f, 1.25f, 6.93f, 1.67f, 7.21f, 2.33f)
                curveTo(7.48f, 2.99f, 7.33f, 3.74f, 6.83f, 4.24f)
                lineTo(4.24f, 6.83f)
                curveTo(3.9f, 7.16f, 3.46f, 7.34f, 3f, 7.34f)
                close()
                moveTo(3f, 2.75f)
                curveTo(2.86f, 2.75f, 2.75f, 2.86f, 2.75f, 3f)
                verticalLineTo(5.59f)
                curveTo(2.75f, 5.74f, 2.85f, 5.8f, 2.9f, 5.82f)
                curveTo(2.96f, 5.84f, 3.07f, 5.87f, 3.17f, 5.77f)
                lineTo(5.76f, 3.18f)
                curveTo(5.86f, 3.08f, 5.84f, 2.97f, 5.81f, 2.91f)
                curveTo(5.78f, 2.85f, 5.72f, 2.76f, 5.58f, 2.76f)
                horizontalLineTo(3f)
                verticalLineTo(2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.999f, 22.75f)
                horizontalLineTo(18.409f)
                curveTo(17.699f, 22.75f, 17.069f, 22.33f, 16.789f, 21.67f)
                curveTo(16.519f, 21.01f, 16.669f, 20.26f, 17.169f, 19.76f)
                lineTo(19.759f, 17.17f)
                curveTo(20.259f, 16.67f, 21.009f, 16.52f, 21.669f, 16.79f)
                curveTo(22.329f, 17.06f, 22.749f, 17.7f, 22.749f, 18.41f)
                verticalLineTo(21f)
                curveTo(22.749f, 21.96f, 21.959f, 22.75f, 20.999f, 22.75f)
                close()
                moveTo(20.989f, 18.16f)
                curveTo(20.939f, 18.16f, 20.879f, 18.18f, 20.819f, 18.24f)
                lineTo(18.229f, 20.83f)
                curveTo(18.129f, 20.93f, 18.149f, 21.04f, 18.179f, 21.1f)
                curveTo(18.209f, 21.16f, 18.269f, 21.25f, 18.409f, 21.25f)
                horizontalLineTo(20.999f)
                curveTo(21.139f, 21.25f, 21.249f, 21.14f, 21.249f, 21f)
                verticalLineTo(18.41f)
                curveTo(21.249f, 18.26f, 21.149f, 18.2f, 21.099f, 18.18f)
                curveTo(21.069f, 18.17f, 21.029f, 18.16f, 20.989f, 18.16f)
                close()
            }
        }.build()

        return _Trade!!
    }

@Suppress("ObjectPropertyName")
private var _Trade: ImageVector? = null
