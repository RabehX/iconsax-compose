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

val Iconsax.Outline.Colorfilter: ImageVector
    get() {
        if (_Colorfilter != null) {
            return _Colorfilter!!
        }
        _Colorfilter = ImageVector.Builder(
            name = "Outline.Colorfilter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 22.75f)
                curveTo(4.28f, 22.75f, 1.25f, 19.72f, 1.25f, 16f)
                curveTo(1.25f, 12.96f, 3.29f, 10.28f, 6.22f, 9.49f)
                curveTo(6.59f, 9.39f, 6.97f, 9.58f, 7.11f, 9.94f)
                curveTo(7.72f, 11.47f, 9.02f, 12.64f, 10.61f, 13.07f)
                curveTo(11.49f, 13.31f, 12.51f, 13.31f, 13.37f, 13.07f)
                curveTo(13.74f, 12.97f, 14.13f, 13.16f, 14.27f, 13.52f)
                curveTo(14.58f, 14.31f, 14.74f, 15.15f, 14.74f, 16.01f)
                curveTo(14.74f, 17.93f, 13.92f, 19.76f, 12.49f, 21.03f)
                curveTo(11.27f, 22.13f, 9.67f, 22.75f, 8f, 22.75f)
                close()
                moveTo(6.02f, 11.13f)
                curveTo(4.07f, 11.93f, 2.75f, 13.85f, 2.75f, 16f)
                curveTo(2.75f, 18.89f, 5.11f, 21.25f, 8f, 21.25f)
                curveTo(9.3f, 21.25f, 10.54f, 20.77f, 11.5f, 19.9f)
                curveTo(12.62f, 18.91f, 13.25f, 17.49f, 13.25f, 16f)
                curveTo(13.25f, 15.54f, 13.19f, 15.1f, 13.08f, 14.67f)
                curveTo(12.14f, 14.82f, 11.12f, 14.77f, 10.22f, 14.52f)
                curveTo(8.41f, 14.02f, 6.89f, 12.78f, 6.02f, 11.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.75f)
                curveTo(11.38f, 14.75f, 10.78f, 14.67f, 10.22f, 14.51f)
                curveTo(8.19f, 13.95f, 6.5f, 12.45f, 5.72f, 10.48f)
                curveTo(5.41f, 9.7f, 5.25f, 8.86f, 5.25f, 8f)
                curveTo(5.25f, 4.28f, 8.28f, 1.25f, 12f, 1.25f)
                curveTo(15.72f, 1.25f, 18.75f, 4.28f, 18.75f, 8f)
                curveTo(18.75f, 8.86f, 18.59f, 9.7f, 18.28f, 10.49f)
                curveTo(17.5f, 12.45f, 15.82f, 13.96f, 13.78f, 14.52f)
                curveTo(13.22f, 14.67f, 12.62f, 14.75f, 12f, 14.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(9.11f, 2.75f, 6.75f, 5.11f, 6.75f, 8f)
                curveTo(6.75f, 8.67f, 6.87f, 9.32f, 7.12f, 9.93f)
                curveTo(7.73f, 11.46f, 9.03f, 12.63f, 10.62f, 13.06f)
                curveTo(11.5f, 13.3f, 12.52f, 13.3f, 13.38f, 13.06f)
                curveTo(14.97f, 12.63f, 16.28f, 11.45f, 16.88f, 9.93f)
                curveTo(17.12f, 9.32f, 17.25f, 8.67f, 17.25f, 8f)
                curveTo(17.25f, 5.11f, 14.89f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                curveTo(14.33f, 22.75f, 12.73f, 22.13f, 11.5f, 21.02f)
                curveTo(11.34f, 20.88f, 11.25f, 20.67f, 11.25f, 20.46f)
                curveTo(11.25f, 20.25f, 11.34f, 20.04f, 11.5f, 19.9f)
                curveTo(12.61f, 18.92f, 13.25f, 17.5f, 13.25f, 16f)
                curveTo(13.25f, 15.33f, 13.13f, 14.68f, 12.88f, 14.07f)
                curveTo(12.8f, 13.87f, 12.81f, 13.65f, 12.91f, 13.46f)
                curveTo(13.01f, 13.27f, 13.18f, 13.13f, 13.38f, 13.07f)
                curveTo(14.97f, 12.64f, 16.27f, 11.47f, 16.88f, 9.94f)
                curveTo(17.02f, 9.58f, 17.41f, 9.4f, 17.77f, 9.49f)
                curveTo(20.7f, 10.29f, 22.74f, 12.96f, 22.74f, 16f)
                curveTo(22.75f, 19.72f, 19.72f, 22.75f, 16f, 22.75f)
                close()
                moveTo(13.12f, 20.39f)
                curveTo(13.97f, 20.95f, 14.96f, 21.25f, 16f, 21.25f)
                curveTo(18.89f, 21.25f, 21.25f, 18.89f, 21.25f, 16f)
                curveTo(21.25f, 13.85f, 19.93f, 11.93f, 17.98f, 11.13f)
                curveTo(17.24f, 12.54f, 16f, 13.66f, 14.52f, 14.26f)
                curveTo(14.67f, 14.82f, 14.75f, 15.41f, 14.75f, 16f)
                curveTo(14.75f, 17.62f, 14.17f, 19.18f, 13.12f, 20.39f)
                close()
            }
        }.build()

        return _Colorfilter!!
    }

@Suppress("ObjectPropertyName")
private var _Colorfilter: ImageVector? = null
