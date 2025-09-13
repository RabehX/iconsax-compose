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

val Iconsax.Outline.Music: ImageVector
    get() {
        if (_Music != null) {
            return _Music!!
        }
        _Music = ImageVector.Builder(
            name = "Outline.Music",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.28f, 22.75f)
                curveTo(4.15f, 22.75f, 2.41f, 21.01f, 2.41f, 18.88f)
                curveTo(2.41f, 16.75f, 4.15f, 15.01f, 6.28f, 15.01f)
                curveTo(8.41f, 15.01f, 10.15f, 16.75f, 10.15f, 18.88f)
                curveTo(10.15f, 21.01f, 8.41f, 22.75f, 6.28f, 22.75f)
                close()
                moveTo(6.28f, 16.51f)
                curveTo(4.97f, 16.51f, 3.91f, 17.57f, 3.91f, 18.88f)
                curveTo(3.91f, 20.19f, 4.97f, 21.25f, 6.28f, 21.25f)
                curveTo(7.59f, 21.25f, 8.65f, 20.19f, 8.65f, 18.88f)
                curveTo(8.65f, 17.57f, 7.59f, 16.51f, 6.28f, 16.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.4f, 19.63f)
                curveTo(8.99f, 19.63f, 8.65f, 19.29f, 8.65f, 18.88f)
                verticalLineTo(6.3f)
                curveTo(8.65f, 4.72f, 9.6f, 3.48f, 11.12f, 3.07f)
                lineTo(17.36f, 1.37f)
                curveTo(18.63f, 1.02f, 19.7f, 1.15f, 20.45f, 1.73f)
                curveTo(21.21f, 2.31f, 21.59f, 3.28f, 21.59f, 4.61f)
                verticalLineTo(16.81f)
                curveTo(21.59f, 17.22f, 21.25f, 17.56f, 20.84f, 17.56f)
                curveTo(20.43f, 17.56f, 20.09f, 17.22f, 20.09f, 16.81f)
                verticalLineTo(4.6f)
                curveTo(20.09f, 4.02f, 19.99f, 3.26f, 19.54f, 2.92f)
                curveTo(19.05f, 2.54f, 18.21f, 2.69f, 17.75f, 2.82f)
                lineTo(11.51f, 4.52f)
                curveTo(10.64f, 4.76f, 10.15f, 5.41f, 10.15f, 6.31f)
                verticalLineTo(18.89f)
                curveTo(10.15f, 19.29f, 9.81f, 19.63f, 9.4f, 19.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.72f, 20.67f)
                curveTo(15.59f, 20.67f, 13.85f, 18.93f, 13.85f, 16.8f)
                curveTo(13.85f, 14.67f, 15.59f, 12.93f, 17.72f, 12.93f)
                curveTo(19.85f, 12.93f, 21.59f, 14.67f, 21.59f, 16.8f)
                curveTo(21.59f, 18.93f, 19.85f, 20.67f, 17.72f, 20.67f)
                close()
                moveTo(17.72f, 14.43f)
                curveTo(16.41f, 14.43f, 15.35f, 15.49f, 15.35f, 16.8f)
                curveTo(15.35f, 18.11f, 16.41f, 19.17f, 17.72f, 19.17f)
                curveTo(19.03f, 19.17f, 20.09f, 18.11f, 20.09f, 16.8f)
                curveTo(20.09f, 15.49f, 19.03f, 14.43f, 17.72f, 14.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.4f, 10.27f)
                curveTo(9.07f, 10.27f, 8.77f, 10.05f, 8.68f, 9.72f)
                curveTo(8.57f, 9.32f, 8.8f, 8.9f, 9.2f, 8.79f)
                lineTo(20.64f, 5.67f)
                curveTo(21.04f, 5.56f, 21.45f, 5.8f, 21.56f, 6.2f)
                curveTo(21.67f, 6.6f, 21.43f, 7.01f, 21.03f, 7.12f)
                lineTo(9.6f, 10.24f)
                curveTo(9.53f, 10.26f, 9.46f, 10.27f, 9.4f, 10.27f)
                close()
            }
        }.build()

        return _Music!!
    }

@Suppress("ObjectPropertyName")
private var _Music: ImageVector? = null
