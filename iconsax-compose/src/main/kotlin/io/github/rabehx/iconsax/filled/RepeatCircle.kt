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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.RepeatCircle: ImageVector
    get() {
        if (_RepeatCircle != null) {
            return _RepeatCircle!!
        }
        _RepeatCircle = ImageVector.Builder(
            name = "Filled.RepeatCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(17.19f, 15.94f)
                curveTo(17.15f, 16.03f, 17.1f, 16.11f, 17.03f, 16.18f)
                lineTo(15.34f, 17.87f)
                curveTo(15.19f, 18.02f, 15f, 18.09f, 14.81f, 18.09f)
                curveTo(14.62f, 18.09f, 14.43f, 18.02f, 14.28f, 17.87f)
                curveTo(13.99f, 17.58f, 13.99f, 17.1f, 14.28f, 16.81f)
                lineTo(14.69f, 16.4f)
                horizontalLineTo(9.1f)
                curveTo(7.8f, 16.4f, 6.75f, 15.34f, 6.75f, 14.05f)
                verticalLineTo(12.28f)
                curveTo(6.75f, 11.87f, 7.09f, 11.53f, 7.5f, 11.53f)
                curveTo(7.91f, 11.53f, 8.25f, 11.87f, 8.25f, 12.28f)
                verticalLineTo(14.05f)
                curveTo(8.25f, 14.52f, 8.63f, 14.9f, 9.1f, 14.9f)
                horizontalLineTo(14.69f)
                lineTo(14.28f, 14.49f)
                curveTo(13.99f, 14.2f, 13.99f, 13.72f, 14.28f, 13.43f)
                curveTo(14.57f, 13.14f, 15.05f, 13.14f, 15.34f, 13.43f)
                lineTo(17.03f, 15.12f)
                curveTo(17.1f, 15.19f, 17.15f, 15.27f, 17.19f, 15.36f)
                curveTo(17.27f, 15.55f, 17.27f, 15.76f, 17.19f, 15.94f)
                close()
                moveTo(17.25f, 11.72f)
                curveTo(17.25f, 12.13f, 16.91f, 12.47f, 16.5f, 12.47f)
                curveTo(16.09f, 12.47f, 15.75f, 12.13f, 15.75f, 11.72f)
                verticalLineTo(9.95f)
                curveTo(15.75f, 9.48f, 15.37f, 9.1f, 14.9f, 9.1f)
                horizontalLineTo(9.31f)
                lineTo(9.72f, 9.5f)
                curveTo(10.01f, 9.79f, 10.01f, 10.27f, 9.72f, 10.56f)
                curveTo(9.57f, 10.71f, 9.38f, 10.78f, 9.19f, 10.78f)
                curveTo(9f, 10.78f, 8.81f, 10.71f, 8.66f, 10.56f)
                lineTo(6.97f, 8.87f)
                curveTo(6.9f, 8.8f, 6.85f, 8.72f, 6.81f, 8.63f)
                curveTo(6.73f, 8.45f, 6.73f, 8.24f, 6.81f, 8.06f)
                curveTo(6.85f, 7.97f, 6.9f, 7.88f, 6.97f, 7.81f)
                lineTo(8.66f, 6.12f)
                curveTo(8.95f, 5.83f, 9.43f, 5.83f, 9.72f, 6.12f)
                curveTo(10.01f, 6.41f, 10.01f, 6.89f, 9.72f, 7.18f)
                lineTo(9.31f, 7.59f)
                horizontalLineTo(14.9f)
                curveTo(16.2f, 7.59f, 17.25f, 8.65f, 17.25f, 9.94f)
                verticalLineTo(11.72f)
                close()
            }
        }.build()

        return _RepeatCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatCircle: ImageVector? = null
