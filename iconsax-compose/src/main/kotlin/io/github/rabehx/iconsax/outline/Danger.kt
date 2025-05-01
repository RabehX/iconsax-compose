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

val Iconsax.Outline.Danger: ImageVector
    get() {
        if (_Danger != null) {
            return _Danger!!
        }
        _Danger = ImageVector.Builder(
            name = "Outline.Danger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.75f)
                curveTo(11.59f, 14.75f, 11.25f, 14.41f, 11.25f, 14f)
                verticalLineTo(9f)
                curveTo(11.25f, 8.59f, 11.59f, 8.25f, 12f, 8.25f)
                curveTo(12.41f, 8.25f, 12.75f, 8.59f, 12.75f, 9f)
                verticalLineTo(14f)
                curveTo(12.75f, 14.41f, 12.41f, 14.75f, 12f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18f)
                curveTo(11.94f, 18f, 11.87f, 17.99f, 11.8f, 17.98f)
                curveTo(11.74f, 17.97f, 11.68f, 17.95f, 11.62f, 17.92f)
                curveTo(11.56f, 17.9f, 11.5f, 17.87f, 11.44f, 17.83f)
                curveTo(11.39f, 17.79f, 11.34f, 17.75f, 11.29f, 17.71f)
                curveTo(11.11f, 17.52f, 11f, 17.26f, 11f, 17f)
                curveTo(11f, 16.74f, 11.11f, 16.48f, 11.29f, 16.29f)
                curveTo(11.34f, 16.25f, 11.39f, 16.21f, 11.44f, 16.17f)
                curveTo(11.5f, 16.13f, 11.56f, 16.1f, 11.62f, 16.08f)
                curveTo(11.68f, 16.05f, 11.74f, 16.03f, 11.8f, 16.02f)
                curveTo(11.93f, 15.99f, 12.07f, 15.99f, 12.19f, 16.02f)
                curveTo(12.26f, 16.03f, 12.32f, 16.05f, 12.38f, 16.08f)
                curveTo(12.44f, 16.1f, 12.5f, 16.13f, 12.56f, 16.17f)
                curveTo(12.61f, 16.21f, 12.66f, 16.25f, 12.71f, 16.29f)
                curveTo(12.89f, 16.48f, 13f, 16.74f, 13f, 17f)
                curveTo(13f, 17.26f, 12.89f, 17.52f, 12.71f, 17.71f)
                curveTo(12.66f, 17.75f, 12.61f, 17.79f, 12.56f, 17.83f)
                curveTo(12.5f, 17.87f, 12.44f, 17.9f, 12.38f, 17.92f)
                curveTo(12.32f, 17.95f, 12.26f, 17.97f, 12.19f, 17.98f)
                curveTo(12.13f, 17.99f, 12.06f, 18f, 12f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.06f, 22.16f)
                horizontalLineTo(5.94f)
                curveTo(3.99f, 22.16f, 2.5f, 21.45f, 1.74f, 20.17f)
                curveTo(0.99f, 18.89f, 1.09f, 17.24f, 2.04f, 15.53f)
                lineTo(8.1f, 4.63f)
                curveTo(9.1f, 2.83f, 10.481f, 1.84f, 12f, 1.84f)
                curveTo(13.521f, 1.84f, 14.901f, 2.83f, 15.901f, 4.63f)
                lineTo(21.961f, 15.54f)
                curveTo(22.91f, 17.25f, 23.021f, 18.89f, 22.26f, 20.18f)
                curveTo(21.5f, 21.45f, 20.01f, 22.16f, 18.06f, 22.16f)
                close()
                moveTo(12f, 3.34f)
                curveTo(11.061f, 3.34f, 10.141f, 4.06f, 9.41f, 5.36f)
                lineTo(3.36f, 16.27f)
                curveTo(2.68f, 17.49f, 2.57f, 18.61f, 3.04f, 19.42f)
                curveTo(3.51f, 20.23f, 4.55f, 20.67f, 5.95f, 20.67f)
                horizontalLineTo(18.07f)
                curveTo(19.471f, 20.67f, 20.5f, 20.23f, 20.98f, 19.42f)
                curveTo(21.461f, 18.61f, 21.34f, 17.5f, 20.66f, 16.27f)
                lineTo(14.59f, 5.36f)
                curveTo(13.861f, 4.06f, 12.941f, 3.34f, 12f, 3.34f)
                close()
            }
        }.build()

        return _Danger!!
    }

@Suppress("ObjectPropertyName")
private var _Danger: ImageVector? = null
