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

val Iconsax.Outline.Status: ImageVector
    get() {
        if (_Status != null) {
            return _Status!!
        }
        _Status = ImageVector.Builder(
            name = "Outline.Status",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.99f, 22.55f)
                curveTo(9.94f, 22.55f, 9.89f, 22.55f, 9.84f, 22.53f)
                curveTo(6.01f, 21.75f, 2.9f, 18.93f, 1.74f, 15.19f)
                curveTo(1.62f, 14.79f, 1.84f, 14.37f, 2.23f, 14.25f)
                curveTo(2.63f, 14.13f, 3.05f, 14.35f, 3.17f, 14.74f)
                curveTo(4.17f, 17.96f, 6.84f, 20.38f, 10.14f, 21.05f)
                curveTo(10.55f, 21.13f, 10.81f, 21.53f, 10.72f, 21.94f)
                curveTo(10.65f, 22.3f, 10.33f, 22.55f, 9.99f, 22.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.95f, 11.73f)
                curveTo(21.57f, 11.73f, 21.24f, 11.44f, 21.2f, 11.06f)
                curveTo(20.72f, 6.32f, 16.76f, 2.75f, 12f, 2.75f)
                curveTo(7.23f, 2.75f, 3.28f, 6.32f, 2.8f, 11.05f)
                curveTo(2.76f, 11.46f, 2.4f, 11.77f, 1.98f, 11.72f)
                curveTo(1.57f, 11.68f, 1.27f, 11.31f, 1.31f, 10.9f)
                curveTo(1.87f, 5.4f, 6.47f, 1.25f, 12f, 1.25f)
                curveTo(17.54f, 1.25f, 22.14f, 5.4f, 22.69f, 10.9f)
                curveTo(22.73f, 11.31f, 22.43f, 11.68f, 22.02f, 11.72f)
                curveTo(22f, 11.73f, 21.97f, 11.73f, 21.95f, 11.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.01f, 22.55f)
                curveTo(13.66f, 22.55f, 13.35f, 22.31f, 13.28f, 21.95f)
                curveTo(13.2f, 21.54f, 13.46f, 21.15f, 13.86f, 21.07f)
                curveTo(17.14f, 20.4f, 19.81f, 18f, 20.82f, 14.8f)
                curveTo(20.94f, 14.4f, 21.37f, 14.18f, 21.76f, 14.31f)
                curveTo(22.16f, 14.43f, 22.37f, 14.86f, 22.25f, 15.25f)
                curveTo(21.07f, 18.97f, 17.97f, 21.76f, 14.16f, 22.54f)
                curveTo(14.11f, 22.54f, 14.06f, 22.55f, 14.01f, 22.55f)
                close()
            }
        }.build()

        return _Status!!
    }

@Suppress("ObjectPropertyName")
private var _Status: ImageVector? = null
