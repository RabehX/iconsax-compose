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

val Iconsax.Outline.Weight: ImageVector
    get() {
        if (_Weight != null) {
            return _Weight!!
        }
        _Weight = ImageVector.Builder(
            name = "Outline.Weight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 22.75f)
                horizontalLineTo(10f)
                curveTo(4.57f, 22.75f, 2.25f, 20.43f, 2.25f, 15f)
                verticalLineTo(9f)
                curveTo(2.25f, 3.57f, 4.57f, 1.25f, 10f, 1.25f)
                horizontalLineTo(14f)
                curveTo(19.43f, 1.25f, 21.75f, 3.57f, 21.75f, 9f)
                verticalLineTo(15f)
                curveTo(21.75f, 20.43f, 19.43f, 22.75f, 14f, 22.75f)
                close()
                moveTo(10f, 2.75f)
                curveTo(5.39f, 2.75f, 3.75f, 4.39f, 3.75f, 9f)
                verticalLineTo(15f)
                curveTo(3.75f, 19.61f, 5.39f, 21.25f, 10f, 21.25f)
                horizontalLineTo(14f)
                curveTo(18.61f, 21.25f, 20.25f, 19.61f, 20.25f, 15f)
                verticalLineTo(9f)
                curveTo(20.25f, 4.39f, 18.61f, 2.75f, 14f, 2.75f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.07f, 12.54f)
                curveTo(14.89f, 12.54f, 14.71f, 12.47f, 14.57f, 12.35f)
                curveTo(13.11f, 11.05f, 10.89f, 11.05f, 9.43f, 12.35f)
                curveTo(9.27f, 12.5f, 9.05f, 12.56f, 8.82f, 12.53f)
                curveTo(8.6f, 12.5f, 8.41f, 12.37f, 8.29f, 12.18f)
                lineTo(6.11f, 8.68f)
                curveTo(5.92f, 8.37f, 5.98f, 7.97f, 6.25f, 7.72f)
                curveTo(9.53f, 4.81f, 14.47f, 4.81f, 17.75f, 7.72f)
                curveTo(18.02f, 7.96f, 18.08f, 8.37f, 17.89f, 8.68f)
                lineTo(15.71f, 12.18f)
                curveTo(15.59f, 12.37f, 15.4f, 12.49f, 15.18f, 12.53f)
                curveTo(15.14f, 12.53f, 15.1f, 12.54f, 15.07f, 12.54f)
                close()
                moveTo(12f, 9.87f)
                curveTo(13f, 9.87f, 13.99f, 10.15f, 14.86f, 10.7f)
                lineTo(16.26f, 8.45f)
                curveTo(13.73f, 6.57f, 10.26f, 6.57f, 7.73f, 8.45f)
                lineTo(9.13f, 10.7f)
                curveTo(10.01f, 10.14f, 11f, 9.87f, 12f, 9.87f)
                close()
            }
        }.build()

        return _Weight!!
    }

@Suppress("ObjectPropertyName")
private var _Weight: ImageVector? = null
