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

val Iconsax.Outline.Car: ImageVector
    get() {
        if (_Car != null) {
            return _Car!!
        }
        _Car = ImageVector.Builder(
            name = "Outline.Car",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.999f, 11.75f)
                horizontalLineTo(3.999f)
                curveTo(3.769f, 11.75f, 3.559f, 11.65f, 3.419f, 11.47f)
                curveTo(3.279f, 11.3f, 3.219f, 11.06f, 3.269f, 10.84f)
                lineTo(4.399f, 5.44f)
                curveTo(4.769f, 3.69f, 5.519f, 2.08f, 8.489f, 2.08f)
                horizontalLineTo(15.519f)
                curveTo(18.489f, 2.08f, 19.239f, 3.7f, 19.609f, 5.44f)
                lineTo(20.739f, 10.85f)
                curveTo(20.789f, 11.07f, 20.729f, 11.3f, 20.589f, 11.48f)
                curveTo(20.439f, 11.65f, 20.229f, 11.75f, 19.999f, 11.75f)
                close()
                moveTo(4.919f, 10.25f)
                horizontalLineTo(19.069f)
                lineTo(18.129f, 5.75f)
                curveTo(17.849f, 4.44f, 17.519f, 3.58f, 15.509f, 3.58f)
                horizontalLineTo(8.489f)
                curveTo(6.479f, 3.58f, 6.149f, 4.44f, 5.869f, 5.75f)
                lineTo(4.919f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.96f, 22.75f)
                horizontalLineTo(18.08f)
                curveTo(16.46f, 22.75f, 16.15f, 21.82f, 15.95f, 21.21f)
                lineTo(15.75f, 20.61f)
                curveTo(15.49f, 19.85f, 15.46f, 19.75f, 14.56f, 19.75f)
                horizontalLineTo(9.44f)
                curveTo(8.54f, 19.75f, 8.48f, 19.92f, 8.25f, 20.61f)
                lineTo(8.05f, 21.21f)
                curveTo(7.84f, 21.83f, 7.54f, 22.75f, 5.92f, 22.75f)
                horizontalLineTo(4.04f)
                curveTo(3.25f, 22.75f, 2.49f, 22.42f, 1.96f, 21.84f)
                curveTo(1.44f, 21.27f, 1.19f, 20.51f, 1.26f, 19.75f)
                lineTo(1.82f, 13.66f)
                curveTo(1.97f, 12.01f, 2.41f, 10.25f, 5.62f, 10.25f)
                horizontalLineTo(18.38f)
                curveTo(21.59f, 10.25f, 22.02f, 12.01f, 22.18f, 13.66f)
                lineTo(22.74f, 19.75f)
                curveTo(22.81f, 20.51f, 22.56f, 21.27f, 22.04f, 21.84f)
                curveTo(21.51f, 22.42f, 20.75f, 22.75f, 19.96f, 22.75f)
                close()
                moveTo(9.44f, 18.25f)
                horizontalLineTo(14.56f)
                curveTo(16.38f, 18.25f, 16.81f, 19.06f, 17.17f, 20.12f)
                lineTo(17.38f, 20.74f)
                curveTo(17.55f, 21.25f, 17.55f, 21.26f, 18.09f, 21.26f)
                horizontalLineTo(19.97f)
                curveTo(20.34f, 21.26f, 20.69f, 21.11f, 20.94f, 20.84f)
                curveTo(21.18f, 20.58f, 21.29f, 20.25f, 21.26f, 19.9f)
                lineTo(20.7f, 13.81f)
                curveTo(20.57f, 12.46f, 20.41f, 11.76f, 18.4f, 11.76f)
                horizontalLineTo(5.62f)
                curveTo(3.6f, 11.76f, 3.44f, 12.46f, 3.32f, 13.81f)
                lineTo(2.76f, 19.9f)
                curveTo(2.73f, 20.25f, 2.84f, 20.58f, 3.08f, 20.84f)
                curveTo(3.32f, 21.11f, 3.68f, 21.26f, 4.05f, 21.26f)
                horizontalLineTo(5.93f)
                curveTo(6.47f, 21.26f, 6.47f, 21.25f, 6.64f, 20.75f)
                lineTo(6.84f, 20.14f)
                curveTo(7.09f, 19.34f, 7.46f, 18.25f, 9.44f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 8.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 8.75f, 2.25f, 8.41f, 2.25f, 8f)
                curveTo(2.25f, 7.59f, 2.59f, 7.25f, 3f, 7.25f)
                horizontalLineTo(4f)
                curveTo(4.41f, 7.25f, 4.75f, 7.59f, 4.75f, 8f)
                curveTo(4.75f, 8.41f, 4.41f, 8.75f, 4f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 8.75f)
                horizontalLineTo(20f)
                curveTo(19.59f, 8.75f, 19.25f, 8.41f, 19.25f, 8f)
                curveTo(19.25f, 7.59f, 19.59f, 7.25f, 20f, 7.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 7.25f, 21.75f, 7.59f, 21.75f, 8f)
                curveTo(21.75f, 8.41f, 21.41f, 8.75f, 21f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 5.75f)
                curveTo(11.59f, 5.75f, 11.25f, 5.41f, 11.25f, 5f)
                verticalLineTo(3f)
                curveTo(11.25f, 2.59f, 11.59f, 2.25f, 12f, 2.25f)
                curveTo(12.41f, 2.25f, 12.75f, 2.59f, 12.75f, 3f)
                verticalLineTo(5f)
                curveTo(12.75f, 5.41f, 12.41f, 5.75f, 12f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 5.75f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 5.75f, 9.75f, 5.41f, 9.75f, 5f)
                curveTo(9.75f, 4.59f, 10.09f, 4.25f, 10.5f, 4.25f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 4.25f, 14.25f, 4.59f, 14.25f, 5f)
                curveTo(14.25f, 5.41f, 13.91f, 5.75f, 13.5f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 15.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 15.75f, 5.25f, 15.41f, 5.25f, 15f)
                curveTo(5.25f, 14.59f, 5.59f, 14.25f, 6f, 14.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 14.25f, 9.75f, 14.59f, 9.75f, 15f)
                curveTo(9.75f, 15.41f, 9.41f, 15.75f, 9f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 15.75f, 14.25f, 15.41f, 14.25f, 15f)
                curveTo(14.25f, 14.59f, 14.59f, 14.25f, 15f, 14.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 14.25f, 18.75f, 14.59f, 18.75f, 15f)
                curveTo(18.75f, 15.41f, 18.41f, 15.75f, 18f, 15.75f)
                close()
            }
        }.build()

        return _Car!!
    }

@Suppress("ObjectPropertyName")
private var _Car: ImageVector? = null
