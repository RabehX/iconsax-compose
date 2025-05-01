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

val Iconsax.Outline.Frame1: ImageVector
    get() {
        if (_Frame1 != null) {
            return _Frame1!!
        }
        _Frame1 = ImageVector.Builder(
            name = "Outline.Frame1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.16f, 11.62f)
                curveTo(12.13f, 11.62f, 12.111f, 11.62f, 12.08f, 11.62f)
                curveTo(12.031f, 11.61f, 11.96f, 11.61f, 11.901f, 11.62f)
                curveTo(9.001f, 11.53f, 6.811f, 9.25f, 6.811f, 6.44f)
                curveTo(6.811f, 3.58f, 9.141f, 1.25f, 12f, 1.25f)
                curveTo(14.861f, 1.25f, 17.191f, 3.58f, 17.191f, 6.44f)
                curveTo(17.181f, 9.25f, 14.981f, 11.53f, 12.191f, 11.62f)
                curveTo(12.181f, 11.62f, 12.17f, 11.62f, 12.16f, 11.62f)
                close()
                moveTo(12f, 2.75f)
                curveTo(9.971f, 2.75f, 8.311f, 4.41f, 8.311f, 6.44f)
                curveTo(8.311f, 8.44f, 9.871f, 10.05f, 11.861f, 10.12f)
                curveTo(11.91f, 10.11f, 12.05f, 10.11f, 12.181f, 10.12f)
                curveTo(14.141f, 10.03f, 15.681f, 8.42f, 15.691f, 6.44f)
                curveTo(15.691f, 4.41f, 14.031f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.17f, 22.55f)
                curveTo(10.21f, 22.55f, 8.24f, 22.05f, 6.75f, 21.05f)
                curveTo(5.36f, 20.13f, 4.6f, 18.87f, 4.6f, 17.5f)
                curveTo(4.6f, 16.13f, 5.36f, 14.86f, 6.75f, 13.93f)
                curveTo(9.75f, 11.94f, 14.61f, 11.94f, 17.59f, 13.93f)
                curveTo(18.97f, 14.85f, 19.74f, 16.11f, 19.74f, 17.48f)
                curveTo(19.74f, 18.85f, 18.98f, 20.12f, 17.59f, 21.05f)
                curveTo(16.09f, 22.05f, 14.13f, 22.55f, 12.17f, 22.55f)
                close()
                moveTo(7.58f, 15.19f)
                curveTo(6.62f, 15.83f, 6.1f, 16.65f, 6.1f, 17.51f)
                curveTo(6.1f, 18.36f, 6.63f, 19.18f, 7.58f, 19.81f)
                curveTo(10.07f, 21.48f, 14.27f, 21.48f, 16.76f, 19.81f)
                curveTo(17.72f, 19.17f, 18.24f, 18.35f, 18.24f, 17.49f)
                curveTo(18.24f, 16.64f, 17.71f, 15.82f, 16.76f, 15.19f)
                curveTo(14.27f, 13.53f, 10.07f, 13.53f, 7.58f, 15.19f)
                close()
            }
        }.build()

        return _Frame1!!
    }

@Suppress("ObjectPropertyName")
private var _Frame1: ImageVector? = null
