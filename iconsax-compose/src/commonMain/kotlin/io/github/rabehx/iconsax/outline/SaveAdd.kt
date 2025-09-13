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

val Iconsax.Outline.SaveAdd: ImageVector
    get() {
        if (_SaveAdd != null) {
            return _SaveAdd!!
        }
        _SaveAdd = ImageVector.Builder(
            name = "Outline.SaveAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.69f, 22.75f)
                curveTo(14.25f, 22.75f, 13.79f, 22.62f, 13.32f, 22.37f)
                lineTo(9.39f, 20.18f)
                curveTo(9.2f, 20.08f, 8.79f, 20.08f, 8.6f, 20.18f)
                lineTo(4.68f, 22.37f)
                curveTo(3.83f, 22.84f, 2.96f, 22.88f, 2.3f, 22.49f)
                curveTo(1.63f, 22.1f, 1.25f, 21.32f, 1.25f, 20.36f)
                verticalLineTo(9f)
                curveTo(1.25f, 6.87f, 2.98f, 5.14f, 5.11f, 5.14f)
                horizontalLineTo(12.89f)
                curveTo(15.02f, 5.14f, 16.75f, 6.87f, 16.75f, 9f)
                verticalLineTo(20.36f)
                curveTo(16.75f, 21.32f, 16.37f, 22.1f, 15.7f, 22.49f)
                curveTo(15.4f, 22.66f, 15.06f, 22.75f, 14.69f, 22.75f)
                close()
                moveTo(9f, 18.6f)
                curveTo(9.4f, 18.6f, 9.79f, 18.69f, 10.12f, 18.87f)
                lineTo(14.05f, 21.06f)
                curveTo(14.41f, 21.26f, 14.74f, 21.31f, 14.94f, 21.19f)
                curveTo(15.13f, 21.08f, 15.25f, 20.76f, 15.25f, 20.35f)
                verticalLineTo(8.99f)
                curveTo(15.25f, 7.69f, 14.19f, 6.63f, 12.89f, 6.63f)
                horizontalLineTo(5.11f)
                curveTo(3.81f, 6.63f, 2.75f, 7.69f, 2.75f, 8.99f)
                verticalLineTo(20.35f)
                curveTo(2.75f, 20.76f, 2.87f, 21.08f, 3.06f, 21.19f)
                curveTo(3.25f, 21.3f, 3.59f, 21.25f, 3.95f, 21.05f)
                lineTo(7.88f, 18.86f)
                curveTo(8.2f, 18.69f, 8.6f, 18.6f, 9f, 18.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.69f, 18.87f)
                curveTo(20.25f, 18.87f, 19.79f, 18.74f, 19.32f, 18.49f)
                lineTo(15.63f, 16.43f)
                curveTo(15.39f, 16.3f, 15.25f, 16.05f, 15.25f, 15.78f)
                verticalLineTo(9f)
                curveTo(15.25f, 7.7f, 14.19f, 6.64f, 12.89f, 6.64f)
                horizontalLineTo(8f)
                curveTo(7.59f, 6.64f, 7.25f, 6.3f, 7.25f, 5.89f)
                verticalLineTo(5.12f)
                curveTo(7.25f, 2.99f, 8.98f, 1.26f, 11.11f, 1.26f)
                horizontalLineTo(18.89f)
                curveTo(21.02f, 1.26f, 22.75f, 2.99f, 22.75f, 5.12f)
                verticalLineTo(16.48f)
                curveTo(22.75f, 17.44f, 22.37f, 18.22f, 21.7f, 18.61f)
                curveTo(21.4f, 18.78f, 21.06f, 18.87f, 20.69f, 18.87f)
                close()
                moveTo(16.75f, 15.33f)
                lineTo(20.05f, 17.18f)
                curveTo(20.41f, 17.38f, 20.74f, 17.43f, 20.94f, 17.31f)
                curveTo(21.13f, 17.2f, 21.25f, 16.88f, 21.25f, 16.47f)
                verticalLineTo(5.11f)
                curveTo(21.25f, 3.81f, 20.19f, 2.75f, 18.89f, 2.75f)
                horizontalLineTo(11.11f)
                curveTo(9.81f, 2.75f, 8.75f, 3.81f, 8.75f, 5.11f)
                verticalLineTo(5.13f)
                horizontalLineTo(12.89f)
                curveTo(15.02f, 5.13f, 16.75f, 6.86f, 16.75f, 8.99f)
                verticalLineTo(15.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7f, 11.25f)
                horizontalLineTo(11f)
                curveTo(11.41f, 11.25f, 11.75f, 11.59f, 11.75f, 12f)
                curveTo(11.75f, 12.41f, 11.41f, 12.75f, 11f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 14.75f)
                curveTo(8.59f, 14.75f, 8.25f, 14.41f, 8.25f, 14f)
                verticalLineTo(10f)
                curveTo(8.25f, 9.59f, 8.59f, 9.25f, 9f, 9.25f)
                curveTo(9.41f, 9.25f, 9.75f, 9.59f, 9.75f, 10f)
                verticalLineTo(14f)
                curveTo(9.75f, 14.41f, 9.41f, 14.75f, 9f, 14.75f)
                close()
            }
        }.build()

        return _SaveAdd!!
    }

@Suppress("ObjectPropertyName")
private var _SaveAdd: ImageVector? = null
