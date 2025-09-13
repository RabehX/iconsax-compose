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

val Iconsax.Outline.LampOn: ImageVector
    get() {
        if (_LampOn != null) {
            return _LampOn!!
        }
        _LampOn = ImageVector.Builder(
            name = "Outline.LampOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.77f, 19.75f)
                horizontalLineTo(9.26f)
                curveTo(8.82f, 19.75f, 8.26f, 19.7f, 7.89f, 19.32f)
                curveTo(7.53f, 18.95f, 7.54f, 18.49f, 7.55f, 18.18f)
                verticalLineTo(17.29f)
                curveTo(5.03f, 15.61f, 3.37f, 12.69f, 3.37f, 9.91f)
                curveTo(3.37f, 7.28f, 4.55f, 4.82f, 6.6f, 3.17f)
                curveTo(8.65f, 1.52f, 11.34f, 0.9f, 13.97f, 1.48f)
                curveTo(16.47f, 2.03f, 18.63f, 3.7f, 19.75f, 5.95f)
                curveTo(21.92f, 10.32f, 19.83f, 15.05f, 16.49f, 17.3f)
                verticalLineTo(18.05f)
                curveTo(16.5f, 18.34f, 16.51f, 18.87f, 16.1f, 19.29f)
                curveTo(15.79f, 19.59f, 15.35f, 19.75f, 14.77f, 19.75f)
                close()
                moveTo(9.04f, 18.24f)
                curveTo(9.09f, 18.24f, 9.16f, 18.25f, 9.25f, 18.25f)
                horizontalLineTo(14.77f)
                curveTo(14.87f, 18.25f, 14.94f, 18.24f, 14.98f, 18.23f)
                curveTo(14.98f, 18.2f, 14.98f, 18.16f, 14.98f, 18.13f)
                verticalLineTo(16.87f)
                curveTo(14.98f, 16.61f, 15.12f, 16.36f, 15.34f, 16.23f)
                curveTo(18.3f, 14.44f, 20.26f, 10.35f, 18.39f, 6.6f)
                curveTo(17.47f, 4.75f, 15.69f, 3.38f, 13.63f, 2.93f)
                curveTo(11.45f, 2.45f, 9.22f, 2.96f, 7.52f, 4.33f)
                curveTo(5.82f, 5.7f, 4.85f, 7.73f, 4.85f, 9.91f)
                curveTo(4.85f, 12.69f, 6.77f, 15.09f, 8.67f, 16.24f)
                curveTo(8.9f, 16.38f, 9.03f, 16.62f, 9.03f, 16.88f)
                verticalLineTo(18.23f)
                curveTo(9.04f, 18.23f, 9.04f, 18.23f, 9.04f, 18.24f)
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

        return _LampOn!!
    }

@Suppress("ObjectPropertyName")
private var _LampOn: ImageVector? = null
