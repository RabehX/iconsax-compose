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

val Iconsax.Outline.ShieldSearch: ImageVector
    get() {
        if (_ShieldSearch != null) {
            return _ShieldSearch!!
        }
        _ShieldSearch = ImageVector.Builder(
            name = "Outline.ShieldSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(10.87f, 22.75f, 9.79f, 22.42f, 8.98f, 21.81f)
                lineTo(4.68f, 18.6f)
                curveTo(3.54f, 17.75f, 2.65f, 15.98f, 2.65f, 14.56f)
                verticalLineTo(7.12f)
                curveTo(2.65f, 5.58f, 3.78f, 3.94f, 5.23f, 3.4f)
                lineTo(10.22f, 1.53f)
                curveTo(11.21f, 1.16f, 12.77f, 1.16f, 13.76f, 1.53f)
                lineTo(18.76f, 3.4f)
                curveTo(20.21f, 3.94f, 21.34f, 5.58f, 21.34f, 7.12f)
                verticalLineTo(10.55f)
                curveTo(21.34f, 10.96f, 21f, 11.3f, 20.59f, 11.3f)
                curveTo(20.18f, 11.3f, 19.84f, 10.96f, 19.84f, 10.55f)
                verticalLineTo(7.12f)
                curveTo(19.84f, 6.21f, 19.09f, 5.13f, 18.23f, 4.8f)
                lineTo(13.24f, 2.93f)
                curveTo(12.58f, 2.68f, 11.41f, 2.68f, 10.75f, 2.93f)
                lineTo(5.76f, 4.81f)
                curveTo(4.9f, 5.13f, 4.15f, 6.21f, 4.15f, 7.13f)
                verticalLineTo(14.56f)
                curveTo(4.15f, 15.51f, 4.82f, 16.84f, 5.57f, 17.4f)
                lineTo(9.87f, 20.61f)
                curveTo(10.42f, 21.02f, 11.19f, 21.25f, 11.99f, 21.25f)
                curveTo(12.4f, 21.25f, 12.74f, 21.59f, 12.74f, 22f)
                curveTo(12.74f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 20.75f)
                curveTo(13.38f, 20.75f, 11.25f, 18.62f, 11.25f, 16f)
                curveTo(11.25f, 13.38f, 13.38f, 11.25f, 16f, 11.25f)
                curveTo(18.62f, 11.25f, 20.75f, 13.38f, 20.75f, 16f)
                curveTo(20.75f, 18.62f, 18.62f, 20.75f, 16f, 20.75f)
                close()
                moveTo(16f, 12.76f)
                curveTo(14.21f, 12.76f, 12.75f, 14.22f, 12.75f, 16.01f)
                curveTo(12.75f, 17.8f, 14.21f, 19.26f, 16f, 19.26f)
                curveTo(17.79f, 19.26f, 19.25f, 17.8f, 19.25f, 16.01f)
                curveTo(19.25f, 14.22f, 17.79f, 12.76f, 16f, 12.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 22f)
                curveTo(20.93f, 22f, 20.87f, 21.99f, 20.8f, 21.98f)
                curveTo(20.74f, 21.97f, 20.68f, 21.95f, 20.62f, 21.92f)
                curveTo(20.56f, 21.9f, 20.5f, 21.87f, 20.44f, 21.83f)
                curveTo(20.39f, 21.79f, 20.34f, 21.75f, 20.29f, 21.71f)
                curveTo(20.11f, 21.52f, 20f, 21.26f, 20f, 21f)
                curveTo(20f, 20.87f, 20.03f, 20.74f, 20.08f, 20.62f)
                curveTo(20.13f, 20.5f, 20.2f, 20.39f, 20.29f, 20.29f)
                curveTo(20.66f, 19.92f, 21.34f, 19.92f, 21.71f, 20.29f)
                curveTo(21.8f, 20.39f, 21.87f, 20.5f, 21.92f, 20.62f)
                curveTo(21.97f, 20.74f, 22f, 20.87f, 22f, 21f)
                curveTo(22f, 21.26f, 21.89f, 21.52f, 21.71f, 21.71f)
                curveTo(21.52f, 21.89f, 21.26f, 22f, 21f, 22f)
                close()
            }
        }.build()

        return _ShieldSearch!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSearch: ImageVector? = null
