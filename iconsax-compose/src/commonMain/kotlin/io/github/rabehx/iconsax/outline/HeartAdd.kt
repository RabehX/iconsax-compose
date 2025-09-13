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

val Iconsax.Outline.HeartAdd: ImageVector
    get() {
        if (_HeartAdd != null) {
            return _HeartAdd!!
        }
        _HeartAdd = ImageVector.Builder(
            name = "Outline.HeartAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.2f, 22.75f)
                curveTo(14.14f, 22.75f, 11.65f, 20.26f, 11.65f, 17.2f)
                curveTo(11.65f, 14.14f, 14.14f, 11.65f, 17.2f, 11.65f)
                curveTo(20.26f, 11.65f, 22.75f, 14.14f, 22.75f, 17.2f)
                curveTo(22.75f, 20.26f, 20.26f, 22.75f, 17.2f, 22.75f)
                close()
                moveTo(17.2f, 13.15f)
                curveTo(14.97f, 13.15f, 13.15f, 14.97f, 13.15f, 17.2f)
                curveTo(13.15f, 19.43f, 14.97f, 21.25f, 17.2f, 21.25f)
                curveTo(19.43f, 21.25f, 21.25f, 19.43f, 21.25f, 17.2f)
                curveTo(21.25f, 14.97f, 19.43f, 13.15f, 17.2f, 13.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.99f, 18.01f)
                horizontalLineTo(15.4f)
                curveTo(14.99f, 18.01f, 14.65f, 17.67f, 14.65f, 17.26f)
                curveTo(14.65f, 16.85f, 14.99f, 16.51f, 15.4f, 16.51f)
                horizontalLineTo(18.99f)
                curveTo(19.4f, 16.51f, 19.74f, 16.85f, 19.74f, 17.26f)
                curveTo(19.74f, 17.67f, 19.41f, 18.01f, 18.99f, 18.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.199f, 19.85f)
                curveTo(16.789f, 19.85f, 16.449f, 19.51f, 16.449f, 19.1f)
                verticalLineTo(15.51f)
                curveTo(16.449f, 15.1f, 16.789f, 14.76f, 17.199f, 14.76f)
                curveTo(17.609f, 14.76f, 17.949f, 15.1f, 17.949f, 15.51f)
                verticalLineTo(19.1f)
                curveTo(17.949f, 19.51f, 17.609f, 19.85f, 17.199f, 19.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.65f)
                curveTo(11.69f, 21.65f, 11.38f, 21.61f, 11.13f, 21.52f)
                curveTo(8.57f, 20.65f, 1.25f, 16.41f, 1.25f, 8.69f)
                curveTo(1.25f, 5.19f, 4.08f, 2.35f, 7.56f, 2.35f)
                curveTo(9.23f, 2.35f, 10.83f, 3.02f, 12f, 4.19f)
                curveTo(13.17f, 3.02f, 14.78f, 2.35f, 16.44f, 2.35f)
                curveTo(19.92f, 2.35f, 22.75f, 5.19f, 22.75f, 8.69f)
                curveTo(22.75f, 10.64f, 22.28f, 12.51f, 21.35f, 14.26f)
                curveTo(21.24f, 14.47f, 21.03f, 14.62f, 20.79f, 14.65f)
                curveTo(20.54f, 14.68f, 20.31f, 14.6f, 20.14f, 14.42f)
                curveTo(19.36f, 13.6f, 18.31f, 13.14f, 17.19f, 13.14f)
                curveTo(14.96f, 13.14f, 13.14f, 14.96f, 13.14f, 17.19f)
                curveTo(13.14f, 18.18f, 13.51f, 19.14f, 14.18f, 19.89f)
                curveTo(14.34f, 20.07f, 14.4f, 20.31f, 14.35f, 20.54f)
                curveTo(14.3f, 20.77f, 14.14f, 20.97f, 13.93f, 21.07f)
                curveTo(13.53f, 21.25f, 13.17f, 21.4f, 12.84f, 21.51f)
                curveTo(12.61f, 21.61f, 12.31f, 21.65f, 12f, 21.65f)
                close()
                moveTo(7.56f, 3.85f)
                curveTo(4.91f, 3.85f, 2.75f, 6.02f, 2.75f, 8.69f)
                curveTo(2.75f, 15.53f, 9.32f, 19.31f, 11.62f, 20.1f)
                curveTo(11.8f, 20.17f, 12.19f, 20.16f, 12.37f, 20.1f)
                curveTo(12.4f, 20.09f, 12.43f, 20.08f, 12.46f, 20.07f)
                curveTo(11.94f, 19.21f, 11.65f, 18.22f, 11.65f, 17.2f)
                curveTo(11.65f, 14.14f, 14.14f, 11.65f, 17.2f, 11.65f)
                curveTo(18.38f, 11.65f, 19.5f, 12.02f, 20.44f, 12.69f)
                curveTo(20.98f, 11.41f, 21.25f, 10.07f, 21.25f, 8.69f)
                curveTo(21.25f, 6.02f, 19.09f, 3.85f, 16.44f, 3.85f)
                curveTo(14.94f, 3.85f, 13.5f, 4.57f, 12.6f, 5.78f)
                curveTo(12.32f, 6.16f, 11.68f, 6.16f, 11.4f, 5.78f)
                curveTo(10.5f, 4.57f, 9.06f, 3.85f, 7.56f, 3.85f)
                close()
            }
        }.build()

        return _HeartAdd!!
    }

@Suppress("ObjectPropertyName")
private var _HeartAdd: ImageVector? = null
