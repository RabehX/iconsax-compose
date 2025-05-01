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

val Iconsax.Outline.LampSlash: ImageVector
    get() {
        if (_LampSlash != null) {
            return _LampSlash!!
        }
        _LampSlash = ImageVector.Builder(
            name = "Outline.LampSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.18f, 19.08f)
                curveTo(3.99f, 19.08f, 3.8f, 19.01f, 3.65f, 18.86f)
                curveTo(3.36f, 18.57f, 3.36f, 18.09f, 3.65f, 17.8f)
                lineTo(19.5f, 1.95f)
                curveTo(19.79f, 1.66f, 20.27f, 1.66f, 20.56f, 1.95f)
                curveTo(20.85f, 2.24f, 20.85f, 2.72f, 20.56f, 3.01f)
                lineTo(4.71f, 18.86f)
                curveTo(4.56f, 19.01f, 4.37f, 19.08f, 4.18f, 19.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.25f, 13.75f)
                curveTo(4.96f, 13.75f, 4.69f, 13.58f, 4.56f, 13.3f)
                curveTo(4.07f, 12.18f, 3.82f, 11.04f, 3.82f, 9.9f)
                curveTo(3.82f, 7.18f, 5f, 4.67f, 7.05f, 3.01f)
                curveTo(8.97f, 1.47f, 11.35f, 0.91f, 13.75f, 1.44f)
                curveTo(15.33f, 1.79f, 16.77f, 2.62f, 17.9f, 3.84f)
                curveTo(18.18f, 4.14f, 18.16f, 4.62f, 17.86f, 4.9f)
                curveTo(17.56f, 5.18f, 17.08f, 5.16f, 16.8f, 4.86f)
                curveTo(15.87f, 3.86f, 14.71f, 3.18f, 13.43f, 2.9f)
                curveTo(11.48f, 2.48f, 9.55f, 2.93f, 8f, 4.18f)
                curveTo(6.3f, 5.55f, 5.33f, 7.63f, 5.33f, 9.9f)
                curveTo(5.33f, 10.83f, 5.54f, 11.77f, 5.94f, 12.7f)
                curveTo(6.11f, 13.08f, 5.93f, 13.52f, 5.55f, 13.69f)
                curveTo(5.45f, 13.73f, 5.35f, 13.75f, 5.25f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.61f, 19.75f)
                horizontalLineTo(9.42f)
                curveTo(9.03f, 19.75f, 8.48f, 19.71f, 8.11f, 19.33f)
                curveTo(7.75f, 18.96f, 7.76f, 18.49f, 7.77f, 18.18f)
                verticalLineTo(17.27f)
                curveTo(7.37f, 16.99f, 6.99f, 16.67f, 6.63f, 16.31f)
                curveTo(6.34f, 16.02f, 6.34f, 15.54f, 6.63f, 15.25f)
                curveTo(6.92f, 14.96f, 7.4f, 14.96f, 7.69f, 15.25f)
                curveTo(8.08f, 15.63f, 8.49f, 15.97f, 8.92f, 16.25f)
                curveTo(9.13f, 16.39f, 9.27f, 16.63f, 9.27f, 16.88f)
                verticalLineTo(18.22f)
                curveTo(9.27f, 18.23f, 9.27f, 18.24f, 9.27f, 18.25f)
                curveTo(9.31f, 18.25f, 9.36f, 18.25f, 9.43f, 18.25f)
                horizontalLineTo(14.62f)
                curveTo(14.69f, 18.25f, 14.74f, 18.25f, 14.78f, 18.24f)
                curveTo(14.78f, 18.2f, 14.78f, 18.16f, 14.78f, 18.13f)
                verticalLineTo(16.87f)
                curveTo(14.78f, 16.61f, 14.91f, 16.38f, 15.13f, 16.24f)
                curveTo(17.6f, 14.66f, 19.5f, 11.16f, 18.36f, 7.53f)
                curveTo(18.24f, 7.13f, 18.46f, 6.71f, 18.85f, 6.59f)
                curveTo(19.24f, 6.46f, 19.67f, 6.69f, 19.79f, 7.08f)
                curveTo(21.1f, 11.26f, 19.06f, 15.29f, 16.28f, 17.27f)
                verticalLineTo(18.04f)
                curveTo(16.29f, 18.35f, 16.3f, 18.88f, 15.89f, 19.3f)
                curveTo(15.58f, 19.6f, 15.16f, 19.75f, 14.61f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 22.75f)
                curveTo(15.43f, 22.75f, 15.36f, 22.74f, 15.29f, 22.72f)
                curveTo(13.13f, 22.1f, 10.86f, 22.1f, 8.7f, 22.72f)
                curveTo(8.3f, 22.83f, 7.89f, 22.6f, 7.77f, 22.2f)
                curveTo(7.65f, 21.8f, 7.89f, 21.39f, 8.29f, 21.27f)
                curveTo(10.71f, 20.58f, 13.28f, 20.58f, 15.7f, 21.27f)
                curveTo(16.1f, 21.38f, 16.33f, 21.8f, 16.22f, 22.2f)
                curveTo(16.13f, 22.54f, 15.83f, 22.75f, 15.5f, 22.75f)
                close()
            }
        }.build()

        return _LampSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LampSlash: ImageVector? = null
